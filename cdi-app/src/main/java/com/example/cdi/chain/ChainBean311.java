package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean311 {
    @Inject ChainBean113 dep1;
    @Inject ChainBean124 dep2;
    @Inject ChainBean150 dep3;
    public String process() { return "ChainBean311"; }
}
