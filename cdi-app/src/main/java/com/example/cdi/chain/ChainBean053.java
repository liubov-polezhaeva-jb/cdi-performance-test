package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean053 {

    @Inject ChainBean054 dep1;
    @Inject ChainBean061 dep2;
    @Inject ChainBean071 dep3;

    public String process() { return "ChainBean053"; }
}
