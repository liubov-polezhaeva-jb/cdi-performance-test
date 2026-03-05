package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean119 {

    @Inject ChainBean120 dep1;
    @Inject ChainBean127 dep2;
    @Inject ChainBean137 dep3;

    public String process() { return "ChainBean119"; }
}
