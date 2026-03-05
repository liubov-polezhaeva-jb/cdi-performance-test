package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean383 {
    @Inject ChainBean185 dep1;
    @Inject ChainBean196 dep2;
    @Inject ChainBean023 dep3;
    public String process() { return "ChainBean383"; }
}
