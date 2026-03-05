package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean330;
import com.example.cdi.chain.ChainBean400;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.repository.InventoryRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy47")
@Path("/heavy47")
public class HeavyController47 {

    @Inject @Q12 BusinessService q12Business;
    @Inject @Q05 BusinessService q05Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject InventoryRepository repository;
    @Inject ChainBean330 chain1;
    @Inject ChainBean400 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q12Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
