package com.example.cdi.service.payment;

import com.example.cdi.base.mid.MidAbstractPaymentService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q05
@Blue
public class PaymentServiceImpl271 extends MidAbstractPaymentService {
    @Override public String execute(String input) { return format("payment-271:" + input); }
    @Override public boolean isAvailable() { return true; }
}
