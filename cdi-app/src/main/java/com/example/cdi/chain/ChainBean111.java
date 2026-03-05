package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean111 {

    @Inject ChainBean112 dep1;
    @Inject ChainBean119 dep2;
    @Inject ChainBean129 dep3;

    public String process() { return "ChainBean111"; }
}
