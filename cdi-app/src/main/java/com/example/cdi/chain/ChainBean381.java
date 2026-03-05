package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean381 {
    @Inject ChainBean183 dep1;
    @Inject ChainBean194 dep2;
    @Inject ChainBean021 dep3;
    public String process() { return "ChainBean381"; }
}
