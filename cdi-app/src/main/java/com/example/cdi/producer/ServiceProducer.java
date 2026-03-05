package com.example.cdi.producer;

import com.example.cdi.api.*;
import com.example.cdi.qualifier.Blue;
import com.example.cdi.qualifier.Primary;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@ApplicationScoped
public class ServiceProducer {

    @Inject Instance<PaymentService> allPaymentServices;
    @Inject Instance<UserService>    allUserServices;
    @Inject @Blue PaymentService     bluePayment;
    @Inject @Blue UserService        blueUser;

    @Produces @Primary
    public List<PaymentService> producePaymentServiceList() {
        return StreamSupport.stream(allPaymentServices.spliterator(), false)
                .collect(Collectors.toList());
    }

    @Produces @Primary
    public Map<String, UserService> produceUserServiceMap() {
        return Map.of("blue", blueUser);
    }

    @Produces @Primary
    public BusinessService produceBusinessService() {
        return bluePayment;
    }
}
