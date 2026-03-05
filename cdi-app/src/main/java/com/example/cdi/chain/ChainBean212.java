package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean212 {
    @Inject ChainBean014 dep1;
    @Inject ChainBean025 dep2;
    @Inject ChainBean051 dep3;
    public String process() { return "ChainBean212"; }
}
