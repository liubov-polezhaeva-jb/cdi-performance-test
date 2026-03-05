package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean209 {
    @Inject ChainBean011 dep1;
    @Inject ChainBean022 dep2;
    @Inject ChainBean048 dep3;
    public String process() { return "ChainBean209"; }
}
