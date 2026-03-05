package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean324 {
    @Inject ChainBean126 dep1;
    @Inject ChainBean137 dep2;
    @Inject ChainBean163 dep3;
    public String process() { return "ChainBean324"; }
}
