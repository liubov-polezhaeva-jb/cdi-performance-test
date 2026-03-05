package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean359 {
    @Inject ChainBean161 dep1;
    @Inject ChainBean172 dep2;
    @Inject ChainBean198 dep3;
    public String process() { return "ChainBean359"; }
}
