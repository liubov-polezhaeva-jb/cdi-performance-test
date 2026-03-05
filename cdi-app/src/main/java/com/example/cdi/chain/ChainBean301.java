package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean301 {
    @Inject ChainBean103 dep1;
    @Inject ChainBean114 dep2;
    @Inject ChainBean140 dep3;
    public String process() { return "ChainBean301"; }
}
