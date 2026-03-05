package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean142 {

    @Inject ChainBean143 dep1;
    @Inject ChainBean150 dep2;
    @Inject ChainBean160 dep3;

    public String process() { return "ChainBean142"; }
}
