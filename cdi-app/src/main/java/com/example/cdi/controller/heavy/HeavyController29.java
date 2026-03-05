package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean175;
import com.example.cdi.chain.ChainBean178;
import com.example.cdi.qualifier.Q06;
import com.example.cdi.qualifier.Q10;
import com.example.cdi.repository.ReportRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy29")
@Path("/heavy29")
public class HeavyController29 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q06              BusinessService q06Business;
    @Inject @Q10              BusinessService q10Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject ReportRepository repository;
    @Inject ChainBean175 chain1;
    @Inject ChainBean178 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q06Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
