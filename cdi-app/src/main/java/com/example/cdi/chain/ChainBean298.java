package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean298 {
    @Inject ChainBean100 dep1;
    @Inject ChainBean111 dep2;
    @Inject ChainBean137 dep3;
    public String process() { return "ChainBean298"; }
}
