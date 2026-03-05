package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean340 {
    @Inject ChainBean142 dep1;
    @Inject ChainBean153 dep2;
    @Inject ChainBean179 dep3;
    public String process() { return "ChainBean340"; }
}
