package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean372 {
    @Inject ChainBean174 dep1;
    @Inject ChainBean185 dep2;
    @Inject ChainBean012 dep3;
    public String process() { return "ChainBean372"; }
}
