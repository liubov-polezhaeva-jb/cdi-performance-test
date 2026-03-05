package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean134 {

    @Inject ChainBean135 dep1;
    @Inject ChainBean142 dep2;
    @Inject ChainBean152 dep3;

    public String process() { return "ChainBean134"; }
}
