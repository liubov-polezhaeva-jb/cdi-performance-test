package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean164 {

    @Inject ChainBean165 dep1;
    @Inject ChainBean172 dep2;
    @Inject ChainBean182 dep3;

    public String process() { return "ChainBean164"; }
}
