package com.example.cdi.service.payment;

import com.example.cdi.base.mid.MidAbstractPaymentService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q06
@Q07
@Red
public class PaymentServiceImpl204 extends MidAbstractPaymentService {
    @Override public String execute(String input) { return format("payment-204:" + input); }
    @Override public boolean isAvailable() { return true; }
}
