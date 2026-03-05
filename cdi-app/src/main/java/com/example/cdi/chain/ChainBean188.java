package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean188 {

    @Inject ChainBean189 dep1;
    @Inject ChainBean196 dep2;
    @Inject ChainBean007 dep3;

    public String process() { return "ChainBean188"; }
}
