package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean116 {

    @Inject ChainBean117 dep1;
    @Inject ChainBean124 dep2;
    @Inject ChainBean134 dep3;

    public String process() { return "ChainBean116"; }
}
