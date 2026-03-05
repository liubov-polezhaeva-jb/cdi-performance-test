package com.example.cdi.controller;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean001;
import com.example.cdi.chain.ChainBean050;
import com.example.cdi.chain.ChainBean100;
import com.example.cdi.chain.ChainBean150;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.trigger.BizSvc;
import com.example.cdi.trigger.PaySvc;
import com.example.cdi.trigger.UsrSvc;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/demo")
public class DemoController {

    @Inject @Q05 BusinessService q05Business;
    @Inject @Q08 BusinessService q08Business;
    @Inject       PaymentService anyPayment;

    @Inject ChainBean001 chain001;
    @Inject ChainBean050 chain050;
    @Inject ChainBean100 chain100;
    @Inject ChainBean150 chain150;

    @GET
    @Path("/process")
    @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q05Business.execute("test");
    }

    public void testCompletionPoint() {
        // ============================================================
        // KEY FINDING: CDI plugin fires getInjectedBeans for ALL completion
        // contexts inside a CDI-managed class — not just injection points.
        // Even plain name completion (no dot) and non-CDI tokens trigger it.
        //
        // CACHE RESET between attempts: type a space anywhere → Ctrl+Z
        // This increments PsiModificationTracker and busts CachedValuesManager.
        //
        // TRIGGER A — substring completion (CDI injection candidates)
        //   Reproduces: IDEA-359394 (blocking freeze — fixed in 2024.3.3)
        //   Type: sinessSer  → Ctrl+Space   (1st: slow on 242.x, fast on 251.x after fix)
        //   Esc  → Ctrl+Space               (2nd: fast, cache warm)
        //   Esc  → sinessServ → Ctrl+Space  (3rd: slow on unfixed, fast on fixed)
        //   → CDI plugin disable → repeat → no delay = CDI confirmed as cause
        //   Math: 16 qualifiers × 750 beans × 4 hierarchy levels = 48000 PSI calls
        //
        // TRIGGER B — plain name completion (no dot needed): loading icon 2-3s
        //   Reproduces: IDEA-359394 follow-up (async resolveProducesBeans fires for ALL completions)
        //   Type: BizSvc    → Ctrl+Space   (no dot! loading spinner appears)
        //   Type: PaySvc    → Ctrl+Space   (same spinner)
        //   Type: InstanceOf → Ctrl+Space  (not CDI-related at all — spinner still appears!)
        //   → Root cause: CDI does not check if position is an injection point before running
        //   → CDI plugin disable → repeat → no loading icon = CDI confirmed as cause
        //   Hot path: CdiInjectionUtils.getInjectedBeans → resolveProducesBeans → isAssignable
        //   Math: 200 injection points × 422 @Produces methods × isAssignable() = 84400 type checks
        //         (HeavyProducerBean01-20: 419 producers; ServiceProducer+ConfigProducer: 6 producers)
        // ============================================================
    }
}
