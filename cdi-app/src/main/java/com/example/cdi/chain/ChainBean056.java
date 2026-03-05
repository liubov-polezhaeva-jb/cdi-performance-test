package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean056 {

    @Inject ChainBean057 dep1;
    @Inject ChainBean064 dep2;
    @Inject ChainBean074 dep3;

    public String process() { return "ChainBean056"; }
}
