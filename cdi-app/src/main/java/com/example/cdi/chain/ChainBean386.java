package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean386 {
    @Inject ChainBean188 dep1;
    @Inject ChainBean199 dep2;
    @Inject ChainBean026 dep3;
    public String process() { return "ChainBean386"; }
}
