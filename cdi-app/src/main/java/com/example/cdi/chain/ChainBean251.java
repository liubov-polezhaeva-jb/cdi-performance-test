package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean251 {
    @Inject ChainBean053 dep1;
    @Inject ChainBean064 dep2;
    @Inject ChainBean090 dep3;
    public String process() { return "ChainBean251"; }
}
