package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean368 {
    @Inject ChainBean170 dep1;
    @Inject ChainBean181 dep2;
    @Inject ChainBean008 dep3;
    public String process() { return "ChainBean368"; }
}
