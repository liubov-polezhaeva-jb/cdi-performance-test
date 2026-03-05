package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean091;
import com.example.cdi.chain.ChainBean196;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.repository.CustomerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy15")
@Path("/heavy15")
public class HeavyController15 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q04              BusinessService q04Business;
    @Inject @Q08              BusinessService q08Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject CustomerRepository repository;
    @Inject ChainBean091 chain1;
    @Inject ChainBean196 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q04Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
