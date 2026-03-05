package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean192 {

    @Inject ChainBean193 dep1;
    @Inject ChainBean001 dep2;
    @Inject ChainBean011 dep3;

    public String process() { return "ChainBean192"; }
}
