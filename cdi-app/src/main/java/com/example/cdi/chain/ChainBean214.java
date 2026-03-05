package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean214 {
    @Inject ChainBean016 dep1;
    @Inject ChainBean027 dep2;
    @Inject ChainBean053 dep3;
    public String process() { return "ChainBean214"; }
}
