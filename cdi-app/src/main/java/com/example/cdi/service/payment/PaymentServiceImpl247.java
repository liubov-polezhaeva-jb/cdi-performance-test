package com.example.cdi.service.payment;

import com.example.cdi.base.mid.MidAbstractPaymentService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q05
@Blue
public class PaymentServiceImpl247 extends MidAbstractPaymentService {
    @Override public String execute(String input) { return format("payment-247:" + input); }
    @Override public boolean isAvailable() { return true; }
}
