package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean097;
import com.example.cdi.chain.ChainBean009;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.qualifier.Q09;
import com.example.cdi.repository.InvoiceRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy16")
@Path("/heavy16")
public class HeavyController16 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q05              BusinessService q05Business;
    @Inject @Q09              BusinessService q09Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject InvoiceRepository repository;
    @Inject ChainBean097 chain1;
    @Inject ChainBean009 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q05Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
