package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean247 {
    @Inject ChainBean049 dep1;
    @Inject ChainBean060 dep2;
    @Inject ChainBean086 dep3;
    public String process() { return "ChainBean247"; }
}
