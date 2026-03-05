package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean287 {
    @Inject ChainBean089 dep1;
    @Inject ChainBean100 dep2;
    @Inject ChainBean126 dep3;
    public String process() { return "ChainBean287"; }
}
