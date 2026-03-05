package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean113 {

    @Inject ChainBean114 dep1;
    @Inject ChainBean121 dep2;
    @Inject ChainBean131 dep3;

    public String process() { return "ChainBean113"; }
}
