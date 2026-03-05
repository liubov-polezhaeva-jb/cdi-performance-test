package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean312 {
    @Inject ChainBean114 dep1;
    @Inject ChainBean125 dep2;
    @Inject ChainBean151 dep3;
    public String process() { return "ChainBean312"; }
}
