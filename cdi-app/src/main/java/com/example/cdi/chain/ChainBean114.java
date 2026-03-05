package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean114 {

    @Inject ChainBean115 dep1;
    @Inject ChainBean122 dep2;
    @Inject ChainBean132 dep3;

    public String process() { return "ChainBean114"; }
}
