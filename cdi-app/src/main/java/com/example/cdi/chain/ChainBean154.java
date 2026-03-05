package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean154 {

    @Inject ChainBean155 dep1;
    @Inject ChainBean162 dep2;
    @Inject ChainBean172 dep3;

    public String process() { return "ChainBean154"; }
}
