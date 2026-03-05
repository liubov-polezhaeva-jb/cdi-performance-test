package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean072 {

    @Inject ChainBean073 dep1;
    @Inject ChainBean080 dep2;
    @Inject ChainBean090 dep3;

    public String process() { return "ChainBean072"; }
}
