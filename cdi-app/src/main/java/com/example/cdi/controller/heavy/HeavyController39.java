package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean274;
import com.example.cdi.chain.ChainBean264;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.qualifier.Q09;
import com.example.cdi.repository.ReportRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy39")
@Path("/heavy39")
public class HeavyController39 {

    @Inject @Q04 BusinessService q04Business;
    @Inject @Q09 BusinessService q09Business;
    @Inject         BusinessService anyBusiness;
    @Inject         PaymentService  anyPayment;
    @Inject ReportRepository repository;
    @Inject ChainBean274 chain1;
    @Inject ChainBean264 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() { return q04Business.execute("test"); }

    public void testCompletionPoint() {
        // Type "BusinessSer" → Ctrl+Space
    }
}
