package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean362 {
    @Inject ChainBean164 dep1;
    @Inject ChainBean175 dep2;
    @Inject ChainBean002 dep3;
    public String process() { return "ChainBean362"; }
}
