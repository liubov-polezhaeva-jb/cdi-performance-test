package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean210 {
    @Inject ChainBean012 dep1;
    @Inject ChainBean023 dep2;
    @Inject ChainBean049 dep3;
    public String process() { return "ChainBean210"; }
}
