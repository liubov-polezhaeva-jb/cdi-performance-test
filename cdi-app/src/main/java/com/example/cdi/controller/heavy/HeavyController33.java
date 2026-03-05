package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean232;
import com.example.cdi.chain.ChainBean162;
import com.example.cdi.qualifier.Q10;
import com.example.cdi.qualifier.Q03;
import com.example.cdi.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy33")
@Path("/heavy33")
public class HeavyController33 {

    @Inject @Q10 BusinessService q10Business;
    @Inject @Q03 BusinessService q03Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject ProductRepository repository;
    @Inject ChainBean232 chain1;
    @Inject ChainBean162 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q10Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
