package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean246;
import com.example.cdi.chain.ChainBean196;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.repository.CustomerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy35")
@Path("/heavy35")
public class HeavyController35 {

    @Inject @Q12 BusinessService q12Business;
    @Inject @Q05 BusinessService q05Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject CustomerRepository repository;
    @Inject ChainBean246 chain1;
    @Inject ChainBean196 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q12Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
