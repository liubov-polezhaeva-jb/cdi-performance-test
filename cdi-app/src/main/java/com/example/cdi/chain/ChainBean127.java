package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean127 {

    @Inject ChainBean128 dep1;
    @Inject ChainBean135 dep2;
    @Inject ChainBean145 dep3;

    public String process() { return "ChainBean127"; }
}
