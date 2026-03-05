package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean087 {

    @Inject ChainBean088 dep1;
    @Inject ChainBean095 dep2;
    @Inject ChainBean105 dep3;

    public String process() { return "ChainBean087"; }
}
