package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean371 {
    @Inject ChainBean173 dep1;
    @Inject ChainBean184 dep2;
    @Inject ChainBean011 dep3;
    public String process() { return "ChainBean371"; }
}
