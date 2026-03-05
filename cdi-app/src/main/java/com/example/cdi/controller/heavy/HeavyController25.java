package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean151;
import com.example.cdi.chain.ChainBean126;
import com.example.cdi.qualifier.Q02;
import com.example.cdi.qualifier.Q06;
import com.example.cdi.repository.CustomerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy25")
@Path("/heavy25")
public class HeavyController25 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q02              BusinessService q02Business;
    @Inject @Q06              BusinessService q06Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject CustomerRepository repository;
    @Inject ChainBean151 chain1;
    @Inject ChainBean126 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q02Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
