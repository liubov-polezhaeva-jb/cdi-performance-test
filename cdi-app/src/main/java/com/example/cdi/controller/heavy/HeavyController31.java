package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean218;
import com.example.cdi.chain.ChainBean128;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.repository.UserRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy31")
@Path("/heavy31")
public class HeavyController31 {

    @Inject @Q08 BusinessService q08Business;
    @Inject @Q01 BusinessService q01Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject UserRepository repository;
    @Inject ChainBean218 chain1;
    @Inject ChainBean128 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q08Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
