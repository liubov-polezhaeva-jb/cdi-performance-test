package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean347 {
    @Inject ChainBean149 dep1;
    @Inject ChainBean160 dep2;
    @Inject ChainBean186 dep3;
    public String process() { return "ChainBean347"; }
}
