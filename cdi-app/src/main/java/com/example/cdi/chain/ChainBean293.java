package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean293 {
    @Inject ChainBean095 dep1;
    @Inject ChainBean106 dep2;
    @Inject ChainBean132 dep3;
    public String process() { return "ChainBean293"; }
}
