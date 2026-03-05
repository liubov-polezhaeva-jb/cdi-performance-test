package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean161 {

    @Inject ChainBean162 dep1;
    @Inject ChainBean169 dep2;
    @Inject ChainBean179 dep3;

    public String process() { return "ChainBean161"; }
}
