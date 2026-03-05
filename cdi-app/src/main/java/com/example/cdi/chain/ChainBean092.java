package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean092 {

    @Inject ChainBean093 dep1;
    @Inject ChainBean100 dep2;
    @Inject ChainBean110 dep3;

    public String process() { return "ChainBean092"; }
}
