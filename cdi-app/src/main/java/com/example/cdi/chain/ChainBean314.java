package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean314 {
    @Inject ChainBean116 dep1;
    @Inject ChainBean127 dep2;
    @Inject ChainBean153 dep3;
    public String process() { return "ChainBean314"; }
}
