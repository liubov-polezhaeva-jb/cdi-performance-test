package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean089 {

    @Inject ChainBean090 dep1;
    @Inject ChainBean097 dep2;
    @Inject ChainBean107 dep3;

    public String process() { return "ChainBean089"; }
}
