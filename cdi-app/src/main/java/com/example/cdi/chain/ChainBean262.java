package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean262 {
    @Inject ChainBean064 dep1;
    @Inject ChainBean075 dep2;
    @Inject ChainBean101 dep3;
    public String process() { return "ChainBean262"; }
}
