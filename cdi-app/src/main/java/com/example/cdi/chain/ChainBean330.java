package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean330 {
    @Inject ChainBean132 dep1;
    @Inject ChainBean143 dep2;
    @Inject ChainBean169 dep3;
    public String process() { return "ChainBean330"; }
}
