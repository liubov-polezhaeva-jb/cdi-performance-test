package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean243 {
    @Inject ChainBean045 dep1;
    @Inject ChainBean056 dep2;
    @Inject ChainBean082 dep3;
    public String process() { return "ChainBean243"; }
}
