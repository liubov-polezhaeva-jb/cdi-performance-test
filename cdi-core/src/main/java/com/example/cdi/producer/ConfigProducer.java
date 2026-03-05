package com.example.cdi.producer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

@ApplicationScoped
public class ConfigProducer {

    @Produces @Named("appName")
    public String produceAppName() { return "CDI Performance Test App"; }

    @Produces @Named("maxConnections")
    public Integer produceMaxConnections() { return 100; }

    @Produces @Named("timeout")
    public Long produceTimeout() { return 30000L; }
}
