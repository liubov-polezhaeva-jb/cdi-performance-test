package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean279 {
    @Inject ChainBean081 dep1;
    @Inject ChainBean092 dep2;
    @Inject ChainBean118 dep3;
    public String process() { return "ChainBean279"; }
}
