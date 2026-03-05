package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean266 {
    @Inject ChainBean068 dep1;
    @Inject ChainBean079 dep2;
    @Inject ChainBean105 dep3;
    public String process() { return "ChainBean266"; }
}
