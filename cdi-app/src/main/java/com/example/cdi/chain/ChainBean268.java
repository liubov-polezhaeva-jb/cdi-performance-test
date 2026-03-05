package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean268 {
    @Inject ChainBean070 dep1;
    @Inject ChainBean081 dep2;
    @Inject ChainBean107 dep3;
    public String process() { return "ChainBean268"; }
}
