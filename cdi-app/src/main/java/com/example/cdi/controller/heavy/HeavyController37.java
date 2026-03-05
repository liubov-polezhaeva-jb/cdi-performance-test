package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean260;
import com.example.cdi.chain.ChainBean230;
import com.example.cdi.qualifier.Q02;
import com.example.cdi.qualifier.Q07;
import com.example.cdi.repository.InventoryRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy37")
@Path("/heavy37")
public class HeavyController37 {

    @Inject @Q02 BusinessService q02Business;
    @Inject @Q07 BusinessService q07Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject InventoryRepository repository;
    @Inject ChainBean260 chain1;
    @Inject ChainBean230 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q02Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
