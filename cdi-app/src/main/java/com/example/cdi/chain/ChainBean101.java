package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean101 {

    @Inject ChainBean102 dep1;
    @Inject ChainBean109 dep2;
    @Inject ChainBean119 dep3;

    public String process() { return "ChainBean101"; }
}
