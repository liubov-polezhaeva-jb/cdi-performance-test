package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean169 {

    @Inject ChainBean170 dep1;
    @Inject ChainBean177 dep2;
    @Inject ChainBean187 dep3;

    public String process() { return "ChainBean169"; }
}
