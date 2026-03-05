package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean341 {
    @Inject ChainBean143 dep1;
    @Inject ChainBean154 dep2;
    @Inject ChainBean180 dep3;
    public String process() { return "ChainBean341"; }
}
