package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean326 {
    @Inject ChainBean128 dep1;
    @Inject ChainBean139 dep2;
    @Inject ChainBean165 dep3;
    public String process() { return "ChainBean326"; }
}
