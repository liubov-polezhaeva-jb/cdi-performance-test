package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean191 {

    @Inject ChainBean192 dep1;
    @Inject ChainBean199 dep2;
    @Inject ChainBean010 dep3;

    public String process() { return "ChainBean191"; }
}
