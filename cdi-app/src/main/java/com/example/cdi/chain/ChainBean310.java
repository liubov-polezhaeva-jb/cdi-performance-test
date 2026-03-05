package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean310 {
    @Inject ChainBean112 dep1;
    @Inject ChainBean123 dep2;
    @Inject ChainBean149 dep3;
    public String process() { return "ChainBean310"; }
}
