package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean031;
import com.example.cdi.chain.ChainBean066;
import com.example.cdi.qualifier.Q06;
import com.example.cdi.qualifier.Q10;
import com.example.cdi.repository.CustomerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy05")
@Path("/heavy05")
public class HeavyController05 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q06              BusinessService q06Business;
    @Inject @Q10              BusinessService q10Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject CustomerRepository repository;
    @Inject ChainBean031 chain1;
    @Inject ChainBean066 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q06Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
