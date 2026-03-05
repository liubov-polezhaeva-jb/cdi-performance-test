package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean073;
import com.example.cdi.chain.ChainBean157;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.repository.OrderRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy12")
@Path("/heavy12")
public class HeavyController12 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q01              BusinessService q01Business;
    @Inject @Q05              BusinessService q05Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject OrderRepository repository;
    @Inject ChainBean073 chain1;
    @Inject ChainBean157 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q01Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
