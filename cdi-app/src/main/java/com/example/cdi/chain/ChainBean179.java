package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean179 {

    @Inject ChainBean180 dep1;
    @Inject ChainBean187 dep2;
    @Inject ChainBean197 dep3;

    public String process() { return "ChainBean179"; }
}
