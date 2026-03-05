package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean374 {
    @Inject ChainBean176 dep1;
    @Inject ChainBean187 dep2;
    @Inject ChainBean014 dep3;
    public String process() { return "ChainBean374"; }
}
