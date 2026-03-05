package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean284 {
    @Inject ChainBean086 dep1;
    @Inject ChainBean097 dep2;
    @Inject ChainBean123 dep3;
    public String process() { return "ChainBean284"; }
}
