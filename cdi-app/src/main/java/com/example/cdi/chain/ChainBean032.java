package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean032 {

    @Inject ChainBean033 dep1;
    @Inject ChainBean040 dep2;
    @Inject ChainBean050 dep3;

    public String process() { return "ChainBean032"; }
}
