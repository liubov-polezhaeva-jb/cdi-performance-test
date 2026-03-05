package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean028 {

    @Inject ChainBean029 dep1;
    @Inject ChainBean036 dep2;
    @Inject ChainBean046 dep3;

    public String process() { return "ChainBean028"; }
}
