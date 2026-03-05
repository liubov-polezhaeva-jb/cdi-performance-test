package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean131 {

    @Inject ChainBean132 dep1;
    @Inject ChainBean139 dep2;
    @Inject ChainBean149 dep3;

    public String process() { return "ChainBean131"; }
}
