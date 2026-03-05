package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean055 {

    @Inject ChainBean056 dep1;
    @Inject ChainBean063 dep2;
    @Inject ChainBean073 dep3;

    public String process() { return "ChainBean055"; }
}
