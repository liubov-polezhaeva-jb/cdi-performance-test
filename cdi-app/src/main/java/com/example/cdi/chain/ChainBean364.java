package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean364 {
    @Inject ChainBean166 dep1;
    @Inject ChainBean177 dep2;
    @Inject ChainBean004 dep3;
    public String process() { return "ChainBean364"; }
}
