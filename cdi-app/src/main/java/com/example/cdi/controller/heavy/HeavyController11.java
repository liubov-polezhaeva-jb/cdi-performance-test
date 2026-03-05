package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean067;
import com.example.cdi.chain.ChainBean144;
import com.example.cdi.qualifier.Q12;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.repository.UserRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy11")
@Path("/heavy11")
public class HeavyController11 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q12              BusinessService q12Business;
    @Inject @Q04              BusinessService q04Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject UserRepository repository;
    @Inject ChainBean067 chain1;
    @Inject ChainBean144 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q12Business.execute("test");
    }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space to trigger repro
    }
}
