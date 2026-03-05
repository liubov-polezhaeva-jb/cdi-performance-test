package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean062 {

    @Inject ChainBean063 dep1;
    @Inject ChainBean070 dep2;
    @Inject ChainBean080 dep3;

    public String process() { return "ChainBean062"; }
}
