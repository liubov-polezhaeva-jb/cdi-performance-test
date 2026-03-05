package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean065 {

    @Inject ChainBean066 dep1;
    @Inject ChainBean073 dep2;
    @Inject ChainBean083 dep3;

    public String process() { return "ChainBean065"; }
}
