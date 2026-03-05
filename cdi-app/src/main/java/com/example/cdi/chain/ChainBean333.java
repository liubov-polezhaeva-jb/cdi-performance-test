package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean333 {
    @Inject ChainBean135 dep1;
    @Inject ChainBean146 dep2;
    @Inject ChainBean172 dep3;
    public String process() { return "ChainBean333"; }
}
