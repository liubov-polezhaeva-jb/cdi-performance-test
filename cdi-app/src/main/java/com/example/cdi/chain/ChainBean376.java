package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean376 {
    @Inject ChainBean178 dep1;
    @Inject ChainBean189 dep2;
    @Inject ChainBean016 dep3;
    public String process() { return "ChainBean376"; }
}
