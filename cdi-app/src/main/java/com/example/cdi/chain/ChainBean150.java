package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean150 {

    @Inject ChainBean151 dep1;
    @Inject ChainBean158 dep2;
    @Inject ChainBean168 dep3;

    public String process() { return "ChainBean150"; }
}
