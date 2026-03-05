package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean334 {
    @Inject ChainBean136 dep1;
    @Inject ChainBean147 dep2;
    @Inject ChainBean173 dep3;
    public String process() { return "ChainBean334"; }
}
