package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean375 {
    @Inject ChainBean177 dep1;
    @Inject ChainBean188 dep2;
    @Inject ChainBean015 dep3;
    public String process() { return "ChainBean375"; }
}
