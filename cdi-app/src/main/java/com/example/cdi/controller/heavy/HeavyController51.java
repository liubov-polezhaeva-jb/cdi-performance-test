package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean358;
import com.example.cdi.chain.ChainBean068;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.qualifier.Q09;
import com.example.cdi.repository.UserRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy51")
@Path("/heavy51")
public class HeavyController51 {

    @Inject @Q04 BusinessService q04Business;
    @Inject @Q09 BusinessService q09Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject UserRepository repository;
    @Inject ChainBean358 chain1;
    @Inject ChainBean068 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q04Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
