package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean313 {
    @Inject ChainBean115 dep1;
    @Inject ChainBean126 dep2;
    @Inject ChainBean152 dep3;
    public String process() { return "ChainBean313"; }
}
