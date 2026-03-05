package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean149 {

    @Inject ChainBean150 dep1;
    @Inject ChainBean157 dep2;
    @Inject ChainBean167 dep3;

    public String process() { return "ChainBean149"; }
}
