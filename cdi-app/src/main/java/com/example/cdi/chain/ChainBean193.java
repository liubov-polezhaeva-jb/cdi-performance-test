package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean193 {

    @Inject ChainBean194 dep1;
    @Inject ChainBean002 dep2;
    @Inject ChainBean012 dep3;

    public String process() { return "ChainBean193"; }
}
