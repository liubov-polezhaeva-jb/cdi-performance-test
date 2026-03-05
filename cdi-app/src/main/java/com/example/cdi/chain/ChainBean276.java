package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean276 {
    @Inject ChainBean078 dep1;
    @Inject ChainBean089 dep2;
    @Inject ChainBean115 dep3;
    public String process() { return "ChainBean276"; }
}
