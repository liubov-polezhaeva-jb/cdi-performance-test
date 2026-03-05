package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean077 {

    @Inject ChainBean078 dep1;
    @Inject ChainBean085 dep2;
    @Inject ChainBean095 dep3;

    public String process() { return "ChainBean077"; }
}
