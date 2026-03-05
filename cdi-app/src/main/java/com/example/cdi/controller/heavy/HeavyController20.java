package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean121;
import com.example.cdi.chain.ChainBean061;
import com.example.cdi.qualifier.Q09;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.repository.AuditRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy20")
@Path("/heavy20")
public class HeavyController20 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q09              BusinessService q09Business;
    @Inject @Q01              BusinessService q01Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject AuditRepository repository;
    @Inject ChainBean121 chain1;
    @Inject ChainBean061 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q09Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
