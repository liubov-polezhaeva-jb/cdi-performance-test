package com.example.cdi.trigger;

import com.example.cdi.api.PaymentService;
import com.example.cdi.qualifier.Q05;
import com.example.cdi.base.mid.MidAbstractPaymentService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Type "PaySvc." → Ctrl+Space — triggers CDI scan over 300 PaymentService candidates.
 */
@ApplicationScoped
@Q05
public class PaySvc extends MidAbstractPaymentService {

    @Inject @Q05 PaymentService delegate;

    public static String version()  { return "1.0"; }
    public static String currency() { return "USD"; }
    public static PaySvc create()   { return new PaySvc(); }

    @Override public String execute(String input) { return format("PaySvc:" + input); }
    @Override public boolean isAvailable()        { return true; }
}
