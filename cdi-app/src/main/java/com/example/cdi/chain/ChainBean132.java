package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean132 {

    @Inject ChainBean133 dep1;
    @Inject ChainBean140 dep2;
    @Inject ChainBean150 dep3;

    public String process() { return "ChainBean132"; }
}
