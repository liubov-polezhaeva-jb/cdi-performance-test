package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean085 {

    @Inject ChainBean086 dep1;
    @Inject ChainBean093 dep2;
    @Inject ChainBean103 dep3;

    public String process() { return "ChainBean085"; }
}
