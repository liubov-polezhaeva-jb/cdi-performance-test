package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean271 {
    @Inject ChainBean073 dep1;
    @Inject ChainBean084 dep2;
    @Inject ChainBean110 dep3;
    public String process() { return "ChainBean271"; }
}
