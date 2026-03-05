package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean211 {
    @Inject ChainBean013 dep1;
    @Inject ChainBean024 dep2;
    @Inject ChainBean050 dep3;
    public String process() { return "ChainBean211"; }
}
