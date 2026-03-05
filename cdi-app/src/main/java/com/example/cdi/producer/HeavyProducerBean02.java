package com.example.cdi.producer;

import com.example.cdi.api.OrderService;
import com.example.cdi.api.PaymentService;
import com.example.cdi.api.ProductService;
import com.example.cdi.api.UserService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/**
 * HeavyProducerBean02: PaymentService × Q09-Q12/Primary/Secondary + OrderService × Q01-Q08 + ProductService/UserService
 * 20 @Produces methods — stress resolveProducesBeans → isAssignable in CDI plugin (IDEA-359394 follow-up)
 */
@ApplicationScoped
public class HeavyProducerBean02 {

    @Produces @Q09      public PaymentService producePayQ09()      { return null; }
    @Produces @Q10      public PaymentService producePayQ10()      { return null; }
    @Produces @Q11      public PaymentService producePayQ11()      { return null; }
    @Produces @Q12      public PaymentService producePayQ12()      { return null; }
    @Produces @Primary  public PaymentService producePayPrimary()  { return null; }
    @Produces @Secondary public PaymentService producePaySecondary() { return null; }

    @Produces @Q01 public OrderService produceOrderQ01() { return null; }
    @Produces @Q02 public OrderService produceOrderQ02() { return null; }
    @Produces @Q03 public OrderService produceOrderQ03() { return null; }
    @Produces @Q04 public OrderService produceOrderQ04() { return null; }
    @Produces @Q05 public OrderService produceOrderQ05() { return null; }
    @Produces @Q06 public OrderService produceOrderQ06() { return null; }
    @Produces @Q07 public OrderService produceOrderQ07() { return null; }
    @Produces @Q08 public OrderService produceOrderQ08() { return null; }

    @Produces @Q01 public ProductService produceProductQ01() { return null; }
    @Produces @Q02 public ProductService produceProductQ02() { return null; }
    @Produces @Q03 public ProductService produceProductQ03() { return null; }

    @Produces @Q01 public UserService produceUserQ01() { return null; }
    @Produces @Q02 public UserService produceUserQ02() { return null; }
    @Produces @Q03 public UserService produceUserQ03() { return null; }
}
