package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean317 {
    @Inject ChainBean119 dep1;
    @Inject ChainBean130 dep2;
    @Inject ChainBean156 dep3;
    public String process() { return "ChainBean317"; }
}
