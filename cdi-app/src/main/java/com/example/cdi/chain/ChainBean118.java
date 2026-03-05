package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean118 {

    @Inject ChainBean119 dep1;
    @Inject ChainBean126 dep2;
    @Inject ChainBean136 dep3;

    public String process() { return "ChainBean118"; }
}
