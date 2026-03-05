package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean061;
import com.example.cdi.chain.ChainBean131;
import com.example.cdi.qualifier.Q11;
import com.example.cdi.qualifier.Q03;
import com.example.cdi.repository.AuditRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy10")
@Path("/heavy10")
public class HeavyController10 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q11              BusinessService q11Business;
    @Inject @Q03              BusinessService q03Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject AuditRepository repository;
    @Inject ChainBean061 chain1;
    @Inject ChainBean131 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q11Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
