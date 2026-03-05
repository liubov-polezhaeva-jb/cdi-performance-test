package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean304 {
    @Inject ChainBean106 dep1;
    @Inject ChainBean117 dep2;
    @Inject ChainBean143 dep3;
    public String process() { return "ChainBean304"; }
}
