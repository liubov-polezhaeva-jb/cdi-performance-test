package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean365 {
    @Inject ChainBean167 dep1;
    @Inject ChainBean178 dep2;
    @Inject ChainBean005 dep3;
    public String process() { return "ChainBean365"; }
}
