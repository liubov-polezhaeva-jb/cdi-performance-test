package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean295;
import com.example.cdi.chain.ChainBean315;
import com.example.cdi.qualifier.Q07;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.repository.OrderRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy42")
@Path("/heavy42")
public class HeavyController42 {

    @Inject @Q07 BusinessService q07Business;
    @Inject @Q12 BusinessService q12Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject OrderRepository repository;
    @Inject ChainBean295 chain1;
    @Inject ChainBean315 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q07Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
