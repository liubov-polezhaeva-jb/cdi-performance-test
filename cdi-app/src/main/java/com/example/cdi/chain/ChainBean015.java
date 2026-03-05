package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean015 {

    @Inject ChainBean016 dep1;
    @Inject ChainBean023 dep2;
    @Inject ChainBean033 dep3;

    public String process() { return "ChainBean015"; }
}
