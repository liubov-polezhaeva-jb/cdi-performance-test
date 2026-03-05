package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean256 {
    @Inject ChainBean058 dep1;
    @Inject ChainBean069 dep2;
    @Inject ChainBean095 dep3;
    public String process() { return "ChainBean256"; }
}
