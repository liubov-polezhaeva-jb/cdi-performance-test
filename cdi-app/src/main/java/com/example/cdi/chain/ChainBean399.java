package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean399 {
    @Inject ChainBean002 dep1;
    @Inject ChainBean013 dep2;
    @Inject ChainBean039 dep3;
    public String process() { return "ChainBean399"; }
}
