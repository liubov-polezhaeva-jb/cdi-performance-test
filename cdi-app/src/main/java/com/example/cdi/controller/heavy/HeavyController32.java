package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean225;
import com.example.cdi.chain.ChainBean145;
import com.example.cdi.qualifier.Q09;
import com.example.cdi.qualifier.Q02;
import com.example.cdi.repository.OrderRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy32")
@Path("/heavy32")
public class HeavyController32 {

    @Inject @Q09 BusinessService q09Business;
    @Inject @Q02 BusinessService q02Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject OrderRepository repository;
    @Inject ChainBean225 chain1;
    @Inject ChainBean145 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q09Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
