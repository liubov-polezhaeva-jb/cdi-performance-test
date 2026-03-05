package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean112 {

    @Inject ChainBean113 dep1;
    @Inject ChainBean120 dep2;
    @Inject ChainBean130 dep3;

    public String process() { return "ChainBean112"; }
}
