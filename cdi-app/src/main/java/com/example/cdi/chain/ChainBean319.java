package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean319 {
    @Inject ChainBean121 dep1;
    @Inject ChainBean132 dep2;
    @Inject ChainBean158 dep3;
    public String process() { return "ChainBean319"; }
}
