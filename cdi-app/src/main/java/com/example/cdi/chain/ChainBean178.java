package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean178 {

    @Inject ChainBean179 dep1;
    @Inject ChainBean186 dep2;
    @Inject ChainBean196 dep3;

    public String process() { return "ChainBean178"; }
}
