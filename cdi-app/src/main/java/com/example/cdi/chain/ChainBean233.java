package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean233 {
    @Inject ChainBean035 dep1;
    @Inject ChainBean046 dep2;
    @Inject ChainBean072 dep3;
    public String process() { return "ChainBean233"; }
}
