package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean331 {
    @Inject ChainBean133 dep1;
    @Inject ChainBean144 dep2;
    @Inject ChainBean170 dep3;
    public String process() { return "ChainBean331"; }
}
