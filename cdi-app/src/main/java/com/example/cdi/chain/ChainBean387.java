package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean387 {
    @Inject ChainBean189 dep1;
    @Inject ChainBean001 dep2;
    @Inject ChainBean027 dep3;
    public String process() { return "ChainBean387"; }
}
