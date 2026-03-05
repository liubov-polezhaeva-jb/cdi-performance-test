package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean172 {

    @Inject ChainBean173 dep1;
    @Inject ChainBean180 dep2;
    @Inject ChainBean190 dep3;

    public String process() { return "ChainBean172"; }
}
