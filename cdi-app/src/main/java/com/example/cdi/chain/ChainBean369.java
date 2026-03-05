package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean369 {
    @Inject ChainBean171 dep1;
    @Inject ChainBean182 dep2;
    @Inject ChainBean009 dep3;
    public String process() { return "ChainBean369"; }
}
