package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean239;
import com.example.cdi.chain.ChainBean179;
import com.example.cdi.qualifier.Q11;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.repository.PaymentRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy34")
@Path("/heavy34")
public class HeavyController34 {

    @Inject @Q11 BusinessService q11Business;
    @Inject @Q04 BusinessService q04Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject PaymentRepository repository;
    @Inject ChainBean239 chain1;
    @Inject ChainBean179 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q11Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
