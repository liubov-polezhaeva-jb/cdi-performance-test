package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean208 {
    @Inject ChainBean010 dep1;
    @Inject ChainBean021 dep2;
    @Inject ChainBean047 dep3;
    public String process() { return "ChainBean208"; }
}
