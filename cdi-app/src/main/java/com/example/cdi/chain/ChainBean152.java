package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean152 {

    @Inject ChainBean153 dep1;
    @Inject ChainBean160 dep2;
    @Inject ChainBean170 dep3;

    public String process() { return "ChainBean152"; }
}
