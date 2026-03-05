package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean358 {
    @Inject ChainBean160 dep1;
    @Inject ChainBean171 dep2;
    @Inject ChainBean197 dep3;
    public String process() { return "ChainBean358"; }
}
