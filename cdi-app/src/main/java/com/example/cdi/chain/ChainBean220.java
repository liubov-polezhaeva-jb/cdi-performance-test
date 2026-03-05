package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean220 {
    @Inject ChainBean022 dep1;
    @Inject ChainBean033 dep2;
    @Inject ChainBean059 dep3;
    public String process() { return "ChainBean220"; }
}
