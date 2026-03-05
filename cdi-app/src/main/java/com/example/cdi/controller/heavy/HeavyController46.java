package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean323;
import com.example.cdi.chain.ChainBean383;
import com.example.cdi.qualifier.Q11;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.repository.InvoiceRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy46")
@Path("/heavy46")
public class HeavyController46 {

    @Inject @Q11 BusinessService q11Business;
    @Inject @Q04 BusinessService q04Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject InvoiceRepository repository;
    @Inject ChainBean323 chain1;
    @Inject ChainBean383 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q11Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
