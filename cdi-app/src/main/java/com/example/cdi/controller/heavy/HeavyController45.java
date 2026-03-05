package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean316;
import com.example.cdi.chain.ChainBean366;
import com.example.cdi.qualifier.Q10;
import com.example.cdi.qualifier.Q03;
import com.example.cdi.repository.CustomerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy45")
@Path("/heavy45")
public class HeavyController45 {

    @Inject @Q10 BusinessService q10Business;
    @Inject @Q03 BusinessService q03Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject CustomerRepository repository;
    @Inject ChainBean316 chain1;
    @Inject ChainBean366 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q10Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
