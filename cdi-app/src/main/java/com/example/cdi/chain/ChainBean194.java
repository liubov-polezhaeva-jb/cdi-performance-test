package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean194 {

    @Inject ChainBean195 dep1;
    @Inject ChainBean003 dep2;
    @Inject ChainBean013 dep3;

    public String process() { return "ChainBean194"; }
}
