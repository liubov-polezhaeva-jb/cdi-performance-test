package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean043;
import com.example.cdi.chain.ChainBean092;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.repository.InventoryRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy07")
@Path("/heavy07")
public class HeavyController07 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q08              BusinessService q08Business;
    @Inject @Q12              BusinessService q12Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject InventoryRepository repository;
    @Inject ChainBean043 chain1;
    @Inject ChainBean092 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q08Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
