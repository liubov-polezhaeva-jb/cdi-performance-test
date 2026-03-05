package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean273 {
    @Inject ChainBean075 dep1;
    @Inject ChainBean086 dep2;
    @Inject ChainBean112 dep3;
    public String process() { return "ChainBean273"; }
}
