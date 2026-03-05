package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean261 {
    @Inject ChainBean063 dep1;
    @Inject ChainBean074 dep2;
    @Inject ChainBean100 dep3;
    public String process() { return "ChainBean261"; }
}
