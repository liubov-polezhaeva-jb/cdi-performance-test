package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean348 {
    @Inject ChainBean150 dep1;
    @Inject ChainBean161 dep2;
    @Inject ChainBean187 dep3;
    public String process() { return "ChainBean348"; }
}
