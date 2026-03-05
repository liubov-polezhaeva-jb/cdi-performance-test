package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean204 {
    @Inject ChainBean006 dep1;
    @Inject ChainBean017 dep2;
    @Inject ChainBean043 dep3;
    public String process() { return "ChainBean204"; }
}
