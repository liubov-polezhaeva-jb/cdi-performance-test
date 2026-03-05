package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean379 {
    @Inject ChainBean181 dep1;
    @Inject ChainBean192 dep2;
    @Inject ChainBean019 dep3;
    public String process() { return "ChainBean379"; }
}
