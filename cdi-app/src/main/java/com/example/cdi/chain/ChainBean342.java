package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean342 {
    @Inject ChainBean144 dep1;
    @Inject ChainBean155 dep2;
    @Inject ChainBean181 dep3;
    public String process() { return "ChainBean342"; }
}
