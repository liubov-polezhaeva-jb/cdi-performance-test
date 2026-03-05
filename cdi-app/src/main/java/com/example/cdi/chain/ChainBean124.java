package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean124 {

    @Inject ChainBean125 dep1;
    @Inject ChainBean132 dep2;
    @Inject ChainBean142 dep3;

    public String process() { return "ChainBean124"; }
}
