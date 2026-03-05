package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean380 {
    @Inject ChainBean182 dep1;
    @Inject ChainBean193 dep2;
    @Inject ChainBean020 dep3;
    public String process() { return "ChainBean380"; }
}
