package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean016 {

    @Inject ChainBean017 dep1;
    @Inject ChainBean024 dep2;
    @Inject ChainBean034 dep3;

    public String process() { return "ChainBean016"; }
}
