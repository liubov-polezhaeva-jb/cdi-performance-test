package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean231 {
    @Inject ChainBean033 dep1;
    @Inject ChainBean044 dep2;
    @Inject ChainBean070 dep3;
    public String process() { return "ChainBean231"; }
}
