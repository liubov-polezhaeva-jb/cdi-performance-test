package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean363 {
    @Inject ChainBean165 dep1;
    @Inject ChainBean176 dep2;
    @Inject ChainBean003 dep3;
    public String process() { return "ChainBean363"; }
}
