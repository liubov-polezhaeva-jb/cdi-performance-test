package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean110 {

    @Inject ChainBean111 dep1;
    @Inject ChainBean118 dep2;
    @Inject ChainBean128 dep3;

    public String process() { return "ChainBean110"; }
}
