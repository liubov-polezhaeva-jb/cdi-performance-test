package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean054 {

    @Inject ChainBean055 dep1;
    @Inject ChainBean062 dep2;
    @Inject ChainBean072 dep3;

    public String process() { return "ChainBean054"; }
}
