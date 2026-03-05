package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean063 {

    @Inject ChainBean064 dep1;
    @Inject ChainBean071 dep2;
    @Inject ChainBean081 dep3;

    public String process() { return "ChainBean063"; }
}
