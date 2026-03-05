package com.example.cdi.producer;

import com.example.cdi.api.BusinessService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/**
 * HeavyProducerBean01: PaymentService × Q01-Q08 + Blue/Red + BusinessService × Q01-Q08 + Blue/Red
 * 20 @Produces methods — stress resolveProducesBeans → isAssignable in CDI plugin (IDEA-359394 follow-up)
 */
@ApplicationScoped
public class HeavyProducerBean01 {

    @Produces @Q01 public PaymentService producePayQ01() { return null; }
    @Produces @Q02 public PaymentService producePayQ02() { return null; }
    @Produces @Q03 public PaymentService producePayQ03() { return null; }
    @Produces @Q04 public PaymentService producePayQ04() { return null; }
    @Produces @Q05 public PaymentService producePayQ05() { return null; }
    @Produces @Q06 public PaymentService producePayQ06() { return null; }
    @Produces @Q07 public PaymentService producePayQ07() { return null; }
    @Produces @Q08 public PaymentService producePayQ08() { return null; }
    @Produces @Blue public PaymentService producePayBlue() { return null; }
    @Produces @Red  public PaymentService producePayRed()  { return null; }

    @Produces @Q01 public BusinessService produceBizQ01() { return null; }
    @Produces @Q02 public BusinessService produceBizQ02() { return null; }
    @Produces @Q03 public BusinessService produceBizQ03() { return null; }
    @Produces @Q04 public BusinessService produceBizQ04() { return null; }
    @Produces @Q05 public BusinessService produceBizQ05() { return null; }
    @Produces @Q06 public BusinessService produceBizQ06() { return null; }
    @Produces @Q07 public BusinessService produceBizQ07() { return null; }
    @Produces @Q08 public BusinessService produceBizQ08() { return null; }
    @Produces @Blue public BusinessService produceBizBlue() { return null; }
    @Produces @Red  public BusinessService produceBizRed()  { return null; }
}
