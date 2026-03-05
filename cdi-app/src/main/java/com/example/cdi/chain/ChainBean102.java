package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean102 {

    @Inject ChainBean103 dep1;
    @Inject ChainBean110 dep2;
    @Inject ChainBean120 dep3;

    public String process() { return "ChainBean102"; }
}
