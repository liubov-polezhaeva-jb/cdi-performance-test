package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean044 {

    @Inject ChainBean045 dep1;
    @Inject ChainBean052 dep2;
    @Inject ChainBean062 dep3;

    public String process() { return "ChainBean044"; }
}
