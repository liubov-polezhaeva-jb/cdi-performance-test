package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean370 {
    @Inject ChainBean172 dep1;
    @Inject ChainBean183 dep2;
    @Inject ChainBean010 dep3;
    public String process() { return "ChainBean370"; }
}
