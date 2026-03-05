package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean215 {
    @Inject ChainBean017 dep1;
    @Inject ChainBean028 dep2;
    @Inject ChainBean054 dep3;
    public String process() { return "ChainBean215"; }
}
