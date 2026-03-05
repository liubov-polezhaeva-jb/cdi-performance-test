package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean337;
import com.example.cdi.chain.ChainBean017;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.qualifier.Q06;
import com.example.cdi.repository.TransactionRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy48")
@Path("/heavy48")
public class HeavyController48 {

    @Inject @Q01 BusinessService q01Business;
    @Inject @Q06 BusinessService q06Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject TransactionRepository repository;
    @Inject ChainBean337 chain1;
    @Inject ChainBean017 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q01Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
