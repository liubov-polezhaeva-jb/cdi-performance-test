package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean129 {

    @Inject ChainBean130 dep1;
    @Inject ChainBean137 dep2;
    @Inject ChainBean147 dep3;

    public String process() { return "ChainBean129"; }
}
