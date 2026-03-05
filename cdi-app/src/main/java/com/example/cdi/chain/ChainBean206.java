package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean206 {
    @Inject ChainBean008 dep1;
    @Inject ChainBean019 dep2;
    @Inject ChainBean045 dep3;
    public String process() { return "ChainBean206"; }
}
