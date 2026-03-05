package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean045 {

    @Inject ChainBean046 dep1;
    @Inject ChainBean053 dep2;
    @Inject ChainBean063 dep3;

    public String process() { return "ChainBean045"; }
}
