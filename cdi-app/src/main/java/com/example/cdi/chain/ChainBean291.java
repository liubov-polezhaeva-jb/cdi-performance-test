package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean291 {
    @Inject ChainBean093 dep1;
    @Inject ChainBean104 dep2;
    @Inject ChainBean130 dep3;
    public String process() { return "ChainBean291"; }
}
