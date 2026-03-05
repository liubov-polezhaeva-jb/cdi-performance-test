package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean286 {
    @Inject ChainBean088 dep1;
    @Inject ChainBean099 dep2;
    @Inject ChainBean125 dep3;
    public String process() { return "ChainBean286"; }
}
