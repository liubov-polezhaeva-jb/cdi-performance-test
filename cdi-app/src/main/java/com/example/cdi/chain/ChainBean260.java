package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean260 {
    @Inject ChainBean062 dep1;
    @Inject ChainBean073 dep2;
    @Inject ChainBean099 dep3;
    public String process() { return "ChainBean260"; }
}
