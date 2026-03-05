package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean223 {
    @Inject ChainBean025 dep1;
    @Inject ChainBean036 dep2;
    @Inject ChainBean062 dep3;
    public String process() { return "ChainBean223"; }
}
