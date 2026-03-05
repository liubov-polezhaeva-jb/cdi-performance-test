package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean104 {

    @Inject ChainBean105 dep1;
    @Inject ChainBean112 dep2;
    @Inject ChainBean122 dep3;

    public String process() { return "ChainBean104"; }
}
