package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean344;
import com.example.cdi.chain.ChainBean034;
import com.example.cdi.qualifier.Q02;
import com.example.cdi.qualifier.Q07;
import com.example.cdi.repository.ReportRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy49")
@Path("/heavy49")
public class HeavyController49 {

    @Inject @Q02 BusinessService q02Business;
    @Inject @Q07 BusinessService q07Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject ReportRepository repository;
    @Inject ChainBean344 chain1;
    @Inject ChainBean034 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q02Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
