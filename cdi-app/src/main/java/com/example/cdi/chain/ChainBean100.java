package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean100 {

    @Inject ChainBean101 dep1;
    @Inject ChainBean108 dep2;
    @Inject ChainBean118 dep3;

    public String process() { return "ChainBean100"; }
}
