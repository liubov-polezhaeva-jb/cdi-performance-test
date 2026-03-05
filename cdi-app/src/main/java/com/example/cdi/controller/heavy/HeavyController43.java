package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean302;
import com.example.cdi.chain.ChainBean332;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy43")
@Path("/heavy43")
public class HeavyController43 {

    @Inject @Q08 BusinessService q08Business;
    @Inject @Q01 BusinessService q01Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject ProductRepository repository;
    @Inject ChainBean302 chain1;
    @Inject ChainBean332 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q08Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
