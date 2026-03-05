package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean250 {
    @Inject ChainBean052 dep1;
    @Inject ChainBean063 dep2;
    @Inject ChainBean089 dep3;
    public String process() { return "ChainBean250"; }
}
