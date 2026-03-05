package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean345 {
    @Inject ChainBean147 dep1;
    @Inject ChainBean158 dep2;
    @Inject ChainBean184 dep3;
    public String process() { return "ChainBean345"; }
}
