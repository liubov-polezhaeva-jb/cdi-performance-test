package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean299 {
    @Inject ChainBean101 dep1;
    @Inject ChainBean112 dep2;
    @Inject ChainBean138 dep3;
    public String process() { return "ChainBean299"; }
}
