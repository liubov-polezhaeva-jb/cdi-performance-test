package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean170 {

    @Inject ChainBean171 dep1;
    @Inject ChainBean178 dep2;
    @Inject ChainBean188 dep3;

    public String process() { return "ChainBean170"; }
}
