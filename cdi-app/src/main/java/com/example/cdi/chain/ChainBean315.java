package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean315 {
    @Inject ChainBean117 dep1;
    @Inject ChainBean128 dep2;
    @Inject ChainBean154 dep3;
    public String process() { return "ChainBean315"; }
}
