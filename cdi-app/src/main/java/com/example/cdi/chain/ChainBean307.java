package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean307 {
    @Inject ChainBean109 dep1;
    @Inject ChainBean120 dep2;
    @Inject ChainBean146 dep3;
    public String process() { return "ChainBean307"; }
}
