package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean202 {
    @Inject ChainBean004 dep1;
    @Inject ChainBean015 dep2;
    @Inject ChainBean041 dep3;
    public String process() { return "ChainBean202"; }
}
