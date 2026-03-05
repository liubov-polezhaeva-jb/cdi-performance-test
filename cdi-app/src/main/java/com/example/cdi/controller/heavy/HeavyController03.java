package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean019;
import com.example.cdi.chain.ChainBean040;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy03")
@Path("/heavy03")
public class HeavyController03 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q04              BusinessService q04Business;
    @Inject @Q08              BusinessService q08Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject ProductRepository repository;
    @Inject ChainBean019 chain1;
    @Inject ChainBean040 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q04Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
