package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean357 {
    @Inject ChainBean159 dep1;
    @Inject ChainBean170 dep2;
    @Inject ChainBean196 dep3;
    public String process() { return "ChainBean357"; }
}
