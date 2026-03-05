package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean186 {

    @Inject ChainBean187 dep1;
    @Inject ChainBean194 dep2;
    @Inject ChainBean005 dep3;

    public String process() { return "ChainBean186"; }
}
