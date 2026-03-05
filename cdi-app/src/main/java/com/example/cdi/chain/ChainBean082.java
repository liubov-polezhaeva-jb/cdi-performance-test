package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean082 {

    @Inject ChainBean083 dep1;
    @Inject ChainBean090 dep2;
    @Inject ChainBean100 dep3;

    public String process() { return "ChainBean082"; }
}
