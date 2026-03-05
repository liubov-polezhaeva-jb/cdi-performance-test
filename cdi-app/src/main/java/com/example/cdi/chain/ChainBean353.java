package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean353 {
    @Inject ChainBean155 dep1;
    @Inject ChainBean166 dep2;
    @Inject ChainBean192 dep3;
    public String process() { return "ChainBean353"; }
}
