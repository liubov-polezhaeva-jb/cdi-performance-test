package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean201 {
    @Inject ChainBean003 dep1;
    @Inject ChainBean014 dep2;
    @Inject ChainBean040 dep3;
    public String process() { return "ChainBean201"; }
}
