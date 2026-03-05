package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean117 {

    @Inject ChainBean118 dep1;
    @Inject ChainBean125 dep2;
    @Inject ChainBean135 dep3;

    public String process() { return "ChainBean117"; }
}
