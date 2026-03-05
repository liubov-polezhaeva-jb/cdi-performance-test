package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean029 {

    @Inject ChainBean030 dep1;
    @Inject ChainBean037 dep2;
    @Inject ChainBean047 dep3;

    public String process() { return "ChainBean029"; }
}
