package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean080 {

    @Inject ChainBean081 dep1;
    @Inject ChainBean088 dep2;
    @Inject ChainBean098 dep3;

    public String process() { return "ChainBean080"; }
}
