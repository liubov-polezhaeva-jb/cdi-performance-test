package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean365;
import com.example.cdi.chain.ChainBean085;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.qualifier.Q10;
import com.example.cdi.repository.OrderRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy52")
@Path("/heavy52")
public class HeavyController52 {

    @Inject @Q05 BusinessService q05Business;
    @Inject @Q10 BusinessService q10Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject OrderRepository repository;
    @Inject ChainBean365 chain1;
    @Inject ChainBean085 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q05Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
