package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean106 {

    @Inject ChainBean107 dep1;
    @Inject ChainBean114 dep2;
    @Inject ChainBean124 dep3;

    public String process() { return "ChainBean106"; }
}
