package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean145;
import com.example.cdi.chain.ChainBean113;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.repository.PaymentRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy24")
@Path("/heavy24")
public class HeavyController24 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q01              BusinessService q01Business;
    @Inject @Q05              BusinessService q05Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject PaymentRepository repository;
    @Inject ChainBean145 chain1;
    @Inject ChainBean113 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q01Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
