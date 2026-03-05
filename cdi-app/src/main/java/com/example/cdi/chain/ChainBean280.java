package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean280 {
    @Inject ChainBean082 dep1;
    @Inject ChainBean093 dep2;
    @Inject ChainBean119 dep3;
    public String process() { return "ChainBean280"; }
}
