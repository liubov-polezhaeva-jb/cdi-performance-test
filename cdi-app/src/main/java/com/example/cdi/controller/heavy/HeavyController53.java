package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean372;
import com.example.cdi.chain.ChainBean102;
import com.example.cdi.qualifier.Q06;
import com.example.cdi.qualifier.Q11;
import com.example.cdi.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy53")
@Path("/heavy53")
public class HeavyController53 {

    @Inject @Q06 BusinessService q06Business;
    @Inject @Q11 BusinessService q11Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject ProductRepository repository;
    @Inject ChainBean372 chain1;
    @Inject ChainBean102 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q06Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
