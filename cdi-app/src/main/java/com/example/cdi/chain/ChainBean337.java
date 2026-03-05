package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean337 {
    @Inject ChainBean139 dep1;
    @Inject ChainBean150 dep2;
    @Inject ChainBean176 dep3;
    public String process() { return "ChainBean337"; }
}
