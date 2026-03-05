package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean185 {

    @Inject ChainBean186 dep1;
    @Inject ChainBean193 dep2;
    @Inject ChainBean004 dep3;

    public String process() { return "ChainBean185"; }
}
