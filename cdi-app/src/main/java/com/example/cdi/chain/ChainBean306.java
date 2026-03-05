package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean306 {
    @Inject ChainBean108 dep1;
    @Inject ChainBean119 dep2;
    @Inject ChainBean145 dep3;
    public String process() { return "ChainBean306"; }
}
