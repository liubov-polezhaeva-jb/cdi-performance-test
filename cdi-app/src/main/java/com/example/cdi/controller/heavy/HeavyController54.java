package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean379;
import com.example.cdi.chain.ChainBean119;
import com.example.cdi.qualifier.Q07;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.repository.PaymentRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy54")
@Path("/heavy54")
public class HeavyController54 {

    @Inject @Q07 BusinessService q07Business;
    @Inject @Q12 BusinessService q12Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject PaymentRepository repository;
    @Inject ChainBean379 chain1;
    @Inject ChainBean119 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q07Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
