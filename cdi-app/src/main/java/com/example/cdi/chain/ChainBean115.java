package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean115 {

    @Inject ChainBean116 dep1;
    @Inject ChainBean123 dep2;
    @Inject ChainBean133 dep3;

    public String process() { return "ChainBean115"; }
}
