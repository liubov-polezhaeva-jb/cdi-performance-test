package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean046 {

    @Inject ChainBean047 dep1;
    @Inject ChainBean054 dep2;
    @Inject ChainBean064 dep3;

    public String process() { return "ChainBean046"; }
}
