package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean036 {

    @Inject ChainBean037 dep1;
    @Inject ChainBean044 dep2;
    @Inject ChainBean054 dep3;

    public String process() { return "ChainBean036"; }
}
