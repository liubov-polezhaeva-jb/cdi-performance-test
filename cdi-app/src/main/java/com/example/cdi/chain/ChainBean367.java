package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean367 {
    @Inject ChainBean169 dep1;
    @Inject ChainBean180 dep2;
    @Inject ChainBean007 dep3;
    public String process() { return "ChainBean367"; }
}
