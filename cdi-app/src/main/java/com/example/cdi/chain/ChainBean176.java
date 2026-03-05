package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean176 {

    @Inject ChainBean177 dep1;
    @Inject ChainBean184 dep2;
    @Inject ChainBean194 dep3;

    public String process() { return "ChainBean176"; }
}
