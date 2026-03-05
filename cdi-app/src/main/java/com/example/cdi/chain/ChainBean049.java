package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean049 {

    @Inject ChainBean050 dep1;
    @Inject ChainBean057 dep2;
    @Inject ChainBean067 dep3;

    public String process() { return "ChainBean049"; }
}
