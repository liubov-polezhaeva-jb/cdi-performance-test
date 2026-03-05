package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean213 {
    @Inject ChainBean015 dep1;
    @Inject ChainBean026 dep2;
    @Inject ChainBean052 dep3;
    public String process() { return "ChainBean213"; }
}
