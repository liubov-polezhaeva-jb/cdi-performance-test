package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean040 {

    @Inject ChainBean041 dep1;
    @Inject ChainBean048 dep2;
    @Inject ChainBean058 dep3;

    public String process() { return "ChainBean040"; }
}
