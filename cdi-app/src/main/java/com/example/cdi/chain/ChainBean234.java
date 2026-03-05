package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean234 {
    @Inject ChainBean036 dep1;
    @Inject ChainBean047 dep2;
    @Inject ChainBean073 dep3;
    public String process() { return "ChainBean234"; }
}
