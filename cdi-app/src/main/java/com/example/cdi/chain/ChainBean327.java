package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean327 {
    @Inject ChainBean129 dep1;
    @Inject ChainBean140 dep2;
    @Inject ChainBean166 dep3;
    public String process() { return "ChainBean327"; }
}
