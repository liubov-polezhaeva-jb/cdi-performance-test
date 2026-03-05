package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean323 {
    @Inject ChainBean125 dep1;
    @Inject ChainBean136 dep2;
    @Inject ChainBean162 dep3;
    public String process() { return "ChainBean323"; }
}
