package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean378 {
    @Inject ChainBean180 dep1;
    @Inject ChainBean191 dep2;
    @Inject ChainBean018 dep3;
    public String process() { return "ChainBean378"; }
}
