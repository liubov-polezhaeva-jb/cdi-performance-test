package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean394 {
    @Inject ChainBean196 dep1;
    @Inject ChainBean008 dep2;
    @Inject ChainBean034 dep3;
    public String process() { return "ChainBean394"; }
}
