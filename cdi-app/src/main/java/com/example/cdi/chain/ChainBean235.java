package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean235 {
    @Inject ChainBean037 dep1;
    @Inject ChainBean048 dep2;
    @Inject ChainBean074 dep3;
    public String process() { return "ChainBean235"; }
}
