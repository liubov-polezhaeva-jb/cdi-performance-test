package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean332 {
    @Inject ChainBean134 dep1;
    @Inject ChainBean145 dep2;
    @Inject ChainBean171 dep3;
    public String process() { return "ChainBean332"; }
}
