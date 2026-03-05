package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean356 {
    @Inject ChainBean158 dep1;
    @Inject ChainBean169 dep2;
    @Inject ChainBean195 dep3;
    public String process() { return "ChainBean356"; }
}
