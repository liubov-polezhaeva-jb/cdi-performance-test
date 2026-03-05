package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean245 {
    @Inject ChainBean047 dep1;
    @Inject ChainBean058 dep2;
    @Inject ChainBean084 dep3;
    public String process() { return "ChainBean245"; }
}
