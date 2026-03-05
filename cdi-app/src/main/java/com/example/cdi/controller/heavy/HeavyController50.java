package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean351;
import com.example.cdi.chain.ChainBean051;
import com.example.cdi.qualifier.Q03;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.repository.AuditRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy50")
@Path("/heavy50")
public class HeavyController50 {

    @Inject @Q03 BusinessService q03Business;
    @Inject @Q08 BusinessService q08Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject AuditRepository repository;
    @Inject ChainBean351 chain1;
    @Inject ChainBean051 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q03Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
