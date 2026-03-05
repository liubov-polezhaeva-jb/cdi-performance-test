package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean246 {
    @Inject ChainBean048 dep1;
    @Inject ChainBean059 dep2;
    @Inject ChainBean085 dep3;
    public String process() { return "ChainBean246"; }
}
