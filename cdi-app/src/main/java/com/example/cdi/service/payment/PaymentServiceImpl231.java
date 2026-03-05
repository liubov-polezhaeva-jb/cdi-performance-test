package com.example.cdi.service.payment;

import com.example.cdi.base.mid.MidAbstractPaymentService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q05
@Blue
public class PaymentServiceImpl231 extends MidAbstractPaymentService {
    @Override public String execute(String input) { return format("payment-231:" + input); }
    @Override public boolean isAvailable() { return true; }
}
