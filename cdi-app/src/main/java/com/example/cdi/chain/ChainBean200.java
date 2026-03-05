package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean200 {

    @Inject ChainBean002 dep1;
    @Inject ChainBean009 dep2;
    @Inject ChainBean019 dep3;

    public String process() { return "ChainBean200"; }
}
