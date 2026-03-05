package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean139 {

    @Inject ChainBean140 dep1;
    @Inject ChainBean147 dep2;
    @Inject ChainBean157 dep3;

    public String process() { return "ChainBean139"; }
}
