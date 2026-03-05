package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean055;
import com.example.cdi.chain.ChainBean118;
import com.example.cdi.qualifier.Q10;
import com.example.cdi.qualifier.Q02;
import com.example.cdi.repository.ReportRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy09")
@Path("/heavy09")
public class HeavyController09 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q10              BusinessService q10Business;
    @Inject @Q02              BusinessService q02Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject ReportRepository repository;
    @Inject ChainBean055 chain1;
    @Inject ChainBean118 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q10Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
