package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean001 {

    @Inject ChainBean002 dep1;
    @Inject ChainBean009 dep2;
    @Inject ChainBean019 dep3;

    public String process() { return "ChainBean001"; }
}
