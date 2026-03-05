package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean325 {
    @Inject ChainBean127 dep1;
    @Inject ChainBean138 dep2;
    @Inject ChainBean164 dep3;
    public String process() { return "ChainBean325"; }
}
