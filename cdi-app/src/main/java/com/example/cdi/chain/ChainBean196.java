package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean196 {

    @Inject ChainBean197 dep1;
    @Inject ChainBean005 dep2;
    @Inject ChainBean015 dep3;

    public String process() { return "ChainBean196"; }
}
