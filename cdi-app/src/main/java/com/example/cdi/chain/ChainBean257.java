package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean257 {
    @Inject ChainBean059 dep1;
    @Inject ChainBean070 dep2;
    @Inject ChainBean096 dep3;
    public String process() { return "ChainBean257"; }
}
