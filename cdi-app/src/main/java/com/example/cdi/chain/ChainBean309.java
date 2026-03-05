package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean309 {
    @Inject ChainBean111 dep1;
    @Inject ChainBean122 dep2;
    @Inject ChainBean148 dep3;
    public String process() { return "ChainBean309"; }
}
