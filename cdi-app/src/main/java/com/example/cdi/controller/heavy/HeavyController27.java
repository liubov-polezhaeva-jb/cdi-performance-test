package com.example.cdi.controller.heavy;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.chain.ChainBean163;
import com.example.cdi.chain.ChainBean152;
import com.example.cdi.qualifier.Q04;
import com.example.cdi.qualifier.Q08;
import com.example.cdi.repository.InventoryRepository;
import com.example.cdi.service.payment.PaymentServiceImpl001;
import com.example.cdi.service.payment.PaymentServiceImpl002;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Named("heavy27")
@Path("/heavy27")
public class HeavyController27 {

    // BusinessService = broadest type, all 300 impls are candidates
    @Inject @Q04              BusinessService q04Business;
    @Inject @Q08              BusinessService q08Business;
    @Inject                      BusinessService anyBusiness;
    @Inject                      PaymentService  anyPayment;

    @Inject InventoryRepository repository;
    @Inject ChainBean163 chain1;
    @Inject ChainBean152 chain2;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public String process() {
        return q04Business.execute("test");
    }

    public void testCompletionPoint() {
        // reproduce the issue here
    }
}
