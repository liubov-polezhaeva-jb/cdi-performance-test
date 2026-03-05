package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean052 {

    @Inject ChainBean053 dep1;
    @Inject ChainBean060 dep2;
    @Inject ChainBean070 dep3;

    public String process() { return "ChainBean052"; }
}
