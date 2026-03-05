package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean321 {
    @Inject ChainBean123 dep1;
    @Inject ChainBean134 dep2;
    @Inject ChainBean160 dep3;
    public String process() { return "ChainBean321"; }
}
