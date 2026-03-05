package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean393 {
    @Inject ChainBean195 dep1;
    @Inject ChainBean007 dep2;
    @Inject ChainBean033 dep3;
    public String process() { return "ChainBean393"; }
}
