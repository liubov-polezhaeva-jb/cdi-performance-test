package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean151 {

    @Inject ChainBean152 dep1;
    @Inject ChainBean159 dep2;
    @Inject ChainBean169 dep3;

    public String process() { return "ChainBean151"; }
}
