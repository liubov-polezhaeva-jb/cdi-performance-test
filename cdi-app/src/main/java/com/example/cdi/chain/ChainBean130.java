package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean130 {

    @Inject ChainBean131 dep1;
    @Inject ChainBean138 dep2;
    @Inject ChainBean148 dep3;

    public String process() { return "ChainBean130"; }
}
