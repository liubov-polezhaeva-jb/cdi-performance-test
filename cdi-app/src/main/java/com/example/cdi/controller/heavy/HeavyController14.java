package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean085;
import com.example.cdi.chain.ChainBean183;
import com.example.cdi.qualifier.Q03;
import com.example.cdi.qualifier.Q07;
import com.example.cdi.repository.PaymentRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy14")
@Path("/heavy14")
public class HeavyController14 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q03              BusinessService q03Business;
    @Inject @Q07              BusinessService q07Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject PaymentRepository repository;
    @Inject ChainBean085 chain1;
    @Inject ChainBean183 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q03Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
