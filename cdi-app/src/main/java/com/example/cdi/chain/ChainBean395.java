package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean395 {
    @Inject ChainBean197 dep1;
    @Inject ChainBean009 dep2;
    @Inject ChainBean035 dep3;
    public String process() { return "ChainBean395"; }
}
