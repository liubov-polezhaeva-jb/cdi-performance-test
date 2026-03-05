package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean241 {
    @Inject ChainBean043 dep1;
    @Inject ChainBean054 dep2;
    @Inject ChainBean080 dep3;
    public String process() { return "ChainBean241"; }
}
