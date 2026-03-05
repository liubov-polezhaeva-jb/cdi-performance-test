package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean136 {

    @Inject ChainBean137 dep1;
    @Inject ChainBean144 dep2;
    @Inject ChainBean154 dep3;

    public String process() { return "ChainBean136"; }
}
