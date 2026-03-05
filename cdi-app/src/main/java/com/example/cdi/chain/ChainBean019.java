package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean019 {

    @Inject ChainBean020 dep1;
    @Inject ChainBean027 dep2;
    @Inject ChainBean037 dep3;

    public String process() { return "ChainBean019"; }
}
