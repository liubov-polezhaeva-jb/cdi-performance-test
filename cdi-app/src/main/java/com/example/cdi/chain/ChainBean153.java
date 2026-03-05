package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean153 {

    @Inject ChainBean154 dep1;
    @Inject ChainBean161 dep2;
    @Inject ChainBean171 dep3;

    public String process() { return "ChainBean153"; }
}
