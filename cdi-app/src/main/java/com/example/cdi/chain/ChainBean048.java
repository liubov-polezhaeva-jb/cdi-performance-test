package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean048 {

    @Inject ChainBean049 dep1;
    @Inject ChainBean056 dep2;
    @Inject ChainBean066 dep3;

    public String process() { return "ChainBean048"; }
}
