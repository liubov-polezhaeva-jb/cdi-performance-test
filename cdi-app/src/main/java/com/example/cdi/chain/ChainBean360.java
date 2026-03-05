package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean360 {
    @Inject ChainBean162 dep1;
    @Inject ChainBean173 dep2;
    @Inject ChainBean199 dep3;
    public String process() { return "ChainBean360"; }
}
