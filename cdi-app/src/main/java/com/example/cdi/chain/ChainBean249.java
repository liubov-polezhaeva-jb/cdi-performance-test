package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean249 {
    @Inject ChainBean051 dep1;
    @Inject ChainBean062 dep2;
    @Inject ChainBean088 dep3;
    public String process() { return "ChainBean249"; }
}
