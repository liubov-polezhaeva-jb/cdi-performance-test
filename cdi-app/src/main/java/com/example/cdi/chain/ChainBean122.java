package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean122 {

    @Inject ChainBean123 dep1;
    @Inject ChainBean130 dep2;
    @Inject ChainBean140 dep3;

    public String process() { return "ChainBean122"; }
}
