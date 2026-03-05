package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean025 {

    @Inject ChainBean026 dep1;
    @Inject ChainBean033 dep2;
    @Inject ChainBean043 dep3;

    public String process() { return "ChainBean025"; }
}
