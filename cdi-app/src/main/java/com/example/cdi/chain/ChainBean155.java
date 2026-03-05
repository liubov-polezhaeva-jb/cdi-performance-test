package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean155 {

    @Inject ChainBean156 dep1;
    @Inject ChainBean163 dep2;
    @Inject ChainBean173 dep3;

    public String process() { return "ChainBean155"; }
}
