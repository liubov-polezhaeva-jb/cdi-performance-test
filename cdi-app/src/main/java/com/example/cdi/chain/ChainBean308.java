package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean308 {
    @Inject ChainBean110 dep1;
    @Inject ChainBean121 dep2;
    @Inject ChainBean147 dep3;
    public String process() { return "ChainBean308"; }
}
