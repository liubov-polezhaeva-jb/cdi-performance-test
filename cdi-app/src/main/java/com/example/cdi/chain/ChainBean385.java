package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean385 {
    @Inject ChainBean187 dep1;
    @Inject ChainBean198 dep2;
    @Inject ChainBean025 dep3;
    public String process() { return "ChainBean385"; }
}
