package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean002 {

    @Inject ChainBean003 dep1;
    @Inject ChainBean010 dep2;
    @Inject ChainBean020 dep3;

    public String process() { return "ChainBean002"; }
}
