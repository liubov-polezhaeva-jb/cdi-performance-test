package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean269 {
    @Inject ChainBean071 dep1;
    @Inject ChainBean082 dep2;
    @Inject ChainBean108 dep3;
    public String process() { return "ChainBean269"; }
}
