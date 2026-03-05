package com.example.cdi.service.payment;

import com.example.cdi.base.mid.MidAbstractPaymentService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q06
@Q07
@Red
public class PaymentServiceImpl262 extends MidAbstractPaymentService {
    @Override public String execute(String input) { return format("payment-262:" + input); }
    @Override public boolean isAvailable() { return true; }
}
