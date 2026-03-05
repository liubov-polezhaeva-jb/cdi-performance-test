package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean143 {

    @Inject ChainBean144 dep1;
    @Inject ChainBean151 dep2;
    @Inject ChainBean161 dep3;

    public String process() { return "ChainBean143"; }
}
