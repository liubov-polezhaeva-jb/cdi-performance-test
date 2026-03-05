package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean288 {
    @Inject ChainBean090 dep1;
    @Inject ChainBean101 dep2;
    @Inject ChainBean127 dep3;
    public String process() { return "ChainBean288"; }
}
