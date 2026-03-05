package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean275 {
    @Inject ChainBean077 dep1;
    @Inject ChainBean088 dep2;
    @Inject ChainBean114 dep3;
    public String process() { return "ChainBean275"; }
}
