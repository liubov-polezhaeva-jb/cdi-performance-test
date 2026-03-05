package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean024 {

    @Inject ChainBean025 dep1;
    @Inject ChainBean032 dep2;
    @Inject ChainBean042 dep3;

    public String process() { return "ChainBean024"; }
}
