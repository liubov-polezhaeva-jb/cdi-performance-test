package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean244 {
    @Inject ChainBean046 dep1;
    @Inject ChainBean057 dep2;
    @Inject ChainBean083 dep3;
    public String process() { return "ChainBean244"; }
}
