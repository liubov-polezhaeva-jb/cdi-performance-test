package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean267 {
    @Inject ChainBean069 dep1;
    @Inject ChainBean080 dep2;
    @Inject ChainBean106 dep3;
    public String process() { return "ChainBean267"; }
}
