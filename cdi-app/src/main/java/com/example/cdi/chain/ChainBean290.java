package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean290 {
    @Inject ChainBean092 dep1;
    @Inject ChainBean103 dep2;
    @Inject ChainBean129 dep3;
    public String process() { return "ChainBean290"; }
}
