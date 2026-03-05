package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean384 {
    @Inject ChainBean186 dep1;
    @Inject ChainBean197 dep2;
    @Inject ChainBean024 dep3;
    public String process() { return "ChainBean384"; }
}
