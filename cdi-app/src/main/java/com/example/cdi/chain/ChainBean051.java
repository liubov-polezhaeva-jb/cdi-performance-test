package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean051 {

    @Inject ChainBean052 dep1;
    @Inject ChainBean059 dep2;
    @Inject ChainBean069 dep3;

    public String process() { return "ChainBean051"; }
}
