package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean008 {

    @Inject ChainBean009 dep1;
    @Inject ChainBean016 dep2;
    @Inject ChainBean026 dep3;

    public String process() { return "ChainBean008"; }
}
