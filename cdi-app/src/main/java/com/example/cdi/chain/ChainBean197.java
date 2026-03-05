package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean197 {

    @Inject ChainBean198 dep1;
    @Inject ChainBean006 dep2;
    @Inject ChainBean016 dep3;

    public String process() { return "ChainBean197"; }
}
