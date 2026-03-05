package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean120 {

    @Inject ChainBean121 dep1;
    @Inject ChainBean128 dep2;
    @Inject ChainBean138 dep3;

    public String process() { return "ChainBean120"; }
}
