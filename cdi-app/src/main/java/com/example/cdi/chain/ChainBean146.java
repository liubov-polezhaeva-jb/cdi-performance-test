package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean146 {

    @Inject ChainBean147 dep1;
    @Inject ChainBean154 dep2;
    @Inject ChainBean164 dep3;

    public String process() { return "ChainBean146"; }
}
