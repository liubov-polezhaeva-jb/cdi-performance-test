package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean034 {

    @Inject ChainBean035 dep1;
    @Inject ChainBean042 dep2;
    @Inject ChainBean052 dep3;

    public String process() { return "ChainBean034"; }
}
