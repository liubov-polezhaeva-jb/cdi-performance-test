package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean297 {
    @Inject ChainBean099 dep1;
    @Inject ChainBean110 dep2;
    @Inject ChainBean136 dep3;
    public String process() { return "ChainBean297"; }
}
