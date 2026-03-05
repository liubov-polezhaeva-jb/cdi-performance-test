package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean005 {

    @Inject ChainBean006 dep1;
    @Inject ChainBean013 dep2;
    @Inject ChainBean023 dep3;

    public String process() { return "ChainBean005"; }
}
