package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean316 {
    @Inject ChainBean118 dep1;
    @Inject ChainBean129 dep2;
    @Inject ChainBean155 dep3;
    public String process() { return "ChainBean316"; }
}
