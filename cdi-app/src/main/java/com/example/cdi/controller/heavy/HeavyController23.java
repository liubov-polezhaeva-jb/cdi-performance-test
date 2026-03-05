package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean139;
import com.example.cdi.chain.ChainBean100;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy23")
@Path("/heavy23")
public class HeavyController23 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q12              BusinessService q12Business;
    @Inject @Q04              BusinessService q04Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject ProductRepository repository;
    @Inject ChainBean139 chain1;
    @Inject ChainBean100 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q12Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
