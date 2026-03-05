package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean133;
import com.example.cdi.chain.ChainBean087;
import com.example.cdi.qualifier.Q11;
import com.example.cdi.qualifier.Q03;
import com.example.cdi.repository.OrderRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy22")
@Path("/heavy22")
public class HeavyController22 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q11              BusinessService q11Business;
    @Inject @Q03              BusinessService q03Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject OrderRepository repository;
    @Inject ChainBean133 chain1;
    @Inject ChainBean087 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q11Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
