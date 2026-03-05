package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean107 {

    @Inject ChainBean108 dep1;
    @Inject ChainBean115 dep2;
    @Inject ChainBean125 dep3;

    public String process() { return "ChainBean107"; }
}
