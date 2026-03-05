package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean350 {
    @Inject ChainBean152 dep1;
    @Inject ChainBean163 dep2;
    @Inject ChainBean189 dep3;
    public String process() { return "ChainBean350"; }
}
