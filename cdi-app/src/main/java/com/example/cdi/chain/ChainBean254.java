package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean254 {
    @Inject ChainBean056 dep1;
    @Inject ChainBean067 dep2;
    @Inject ChainBean093 dep3;
    public String process() { return "ChainBean254"; }
}
