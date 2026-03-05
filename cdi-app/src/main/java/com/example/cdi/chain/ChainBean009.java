package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean009 {

    @Inject ChainBean010 dep1;
    @Inject ChainBean017 dep2;
    @Inject ChainBean027 dep3;

    public String process() { return "ChainBean009"; }
}
