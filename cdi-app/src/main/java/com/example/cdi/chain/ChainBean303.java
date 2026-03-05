package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean303 {
    @Inject ChainBean105 dep1;
    @Inject ChainBean116 dep2;
    @Inject ChainBean142 dep3;
    public String process() { return "ChainBean303"; }
}
