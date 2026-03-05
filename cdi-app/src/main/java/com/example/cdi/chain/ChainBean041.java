package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean041 {

    @Inject ChainBean042 dep1;
    @Inject ChainBean049 dep2;
    @Inject ChainBean059 dep3;

    public String process() { return "ChainBean041"; }
}
