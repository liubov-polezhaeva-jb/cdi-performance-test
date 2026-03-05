package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean224 {
    @Inject ChainBean026 dep1;
    @Inject ChainBean037 dep2;
    @Inject ChainBean063 dep3;
    public String process() { return "ChainBean224"; }
}
