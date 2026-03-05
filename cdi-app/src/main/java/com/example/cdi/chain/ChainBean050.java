package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean050 {

    @Inject ChainBean051 dep1;
    @Inject ChainBean058 dep2;
    @Inject ChainBean068 dep3;

    public String process() { return "ChainBean050"; }
}
