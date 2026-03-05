package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean343 {
    @Inject ChainBean145 dep1;
    @Inject ChainBean156 dep2;
    @Inject ChainBean182 dep3;
    public String process() { return "ChainBean343"; }
}
