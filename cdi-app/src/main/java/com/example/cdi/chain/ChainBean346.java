package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean346 {
    @Inject ChainBean148 dep1;
    @Inject ChainBean159 dep2;
    @Inject ChainBean185 dep3;
    public String process() { return "ChainBean346"; }
}
