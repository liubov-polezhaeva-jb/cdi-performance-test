package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean392 {
    @Inject ChainBean194 dep1;
    @Inject ChainBean006 dep2;
    @Inject ChainBean032 dep3;
    public String process() { return "ChainBean392"; }
}
