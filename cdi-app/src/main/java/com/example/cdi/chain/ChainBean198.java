package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean198 {

    @Inject ChainBean199 dep1;
    @Inject ChainBean007 dep2;
    @Inject ChainBean017 dep3;

    public String process() { return "ChainBean198"; }
}
