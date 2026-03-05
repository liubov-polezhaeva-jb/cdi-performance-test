package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean105 {

    @Inject ChainBean106 dep1;
    @Inject ChainBean113 dep2;
    @Inject ChainBean123 dep3;

    public String process() { return "ChainBean105"; }
}
