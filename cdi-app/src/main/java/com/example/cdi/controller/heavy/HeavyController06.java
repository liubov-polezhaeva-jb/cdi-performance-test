package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean037;
import com.example.cdi.chain.ChainBean079;
import com.example.cdi.qualifier.Q07;
import com.example.cdi.qualifier.Q11;
import com.example.cdi.repository.InvoiceRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy06")
@Path("/heavy06")
public class HeavyController06 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q07              BusinessService q07Business;
    @Inject @Q11              BusinessService q11Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject InvoiceRepository repository;
    @Inject ChainBean037 chain1;
    @Inject ChainBean079 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q07Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
