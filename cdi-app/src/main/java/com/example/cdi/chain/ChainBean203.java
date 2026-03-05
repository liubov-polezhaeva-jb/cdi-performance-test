package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean203 {
    @Inject ChainBean005 dep1;
    @Inject ChainBean016 dep2;
    @Inject ChainBean042 dep3;
    public String process() { return "ChainBean203"; }
}
