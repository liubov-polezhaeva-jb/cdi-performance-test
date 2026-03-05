package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean148 {

    @Inject ChainBean149 dep1;
    @Inject ChainBean156 dep2;
    @Inject ChainBean166 dep3;

    public String process() { return "ChainBean148"; }
}
