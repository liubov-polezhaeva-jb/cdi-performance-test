package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean351 {
    @Inject ChainBean153 dep1;
    @Inject ChainBean164 dep2;
    @Inject ChainBean190 dep3;
    public String process() { return "ChainBean351"; }
}
