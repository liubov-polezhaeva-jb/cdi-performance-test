package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean017 {

    @Inject ChainBean018 dep1;
    @Inject ChainBean025 dep2;
    @Inject ChainBean035 dep3;

    public String process() { return "ChainBean017"; }
}
