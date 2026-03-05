package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean396 {
    @Inject ChainBean198 dep1;
    @Inject ChainBean010 dep2;
    @Inject ChainBean036 dep3;
    public String process() { return "ChainBean396"; }
}
