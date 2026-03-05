package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean099 {

    @Inject ChainBean100 dep1;
    @Inject ChainBean107 dep2;
    @Inject ChainBean117 dep3;

    public String process() { return "ChainBean099"; }
}
