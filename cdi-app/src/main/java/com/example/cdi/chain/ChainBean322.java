package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean322 {
    @Inject ChainBean124 dep1;
    @Inject ChainBean135 dep2;
    @Inject ChainBean161 dep3;
    public String process() { return "ChainBean322"; }
}
