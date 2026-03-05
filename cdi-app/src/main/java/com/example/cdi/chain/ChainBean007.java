package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean007 {

    @Inject ChainBean008 dep1;
    @Inject ChainBean015 dep2;
    @Inject ChainBean025 dep3;

    public String process() { return "ChainBean007"; }
}
