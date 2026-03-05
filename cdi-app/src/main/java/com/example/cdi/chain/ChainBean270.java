package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean270 {
    @Inject ChainBean072 dep1;
    @Inject ChainBean083 dep2;
    @Inject ChainBean109 dep3;
    public String process() { return "ChainBean270"; }
}
