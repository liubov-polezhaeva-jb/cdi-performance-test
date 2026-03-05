package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean398 {
    @Inject ChainBean001 dep1;
    @Inject ChainBean012 dep2;
    @Inject ChainBean038 dep3;
    public String process() { return "ChainBean398"; }
}
