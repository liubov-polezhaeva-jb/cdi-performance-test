package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean318 {
    @Inject ChainBean120 dep1;
    @Inject ChainBean131 dep2;
    @Inject ChainBean157 dep3;
    public String process() { return "ChainBean318"; }
}
