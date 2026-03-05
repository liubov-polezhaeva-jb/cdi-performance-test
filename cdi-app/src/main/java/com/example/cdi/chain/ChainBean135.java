package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean135 {

    @Inject ChainBean136 dep1;
    @Inject ChainBean143 dep2;
    @Inject ChainBean153 dep3;

    public String process() { return "ChainBean135"; }
}
