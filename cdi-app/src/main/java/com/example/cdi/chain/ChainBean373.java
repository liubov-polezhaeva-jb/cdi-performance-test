package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean373 {
    @Inject ChainBean175 dep1;
    @Inject ChainBean186 dep2;
    @Inject ChainBean013 dep3;
    public String process() { return "ChainBean373"; }
}
