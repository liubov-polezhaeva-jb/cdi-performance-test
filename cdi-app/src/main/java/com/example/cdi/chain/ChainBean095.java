package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean095 {

    @Inject ChainBean096 dep1;
    @Inject ChainBean103 dep2;
    @Inject ChainBean113 dep3;

    public String process() { return "ChainBean095"; }
}
