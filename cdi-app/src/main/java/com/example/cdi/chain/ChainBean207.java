package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean207 {
    @Inject ChainBean009 dep1;
    @Inject ChainBean020 dep2;
    @Inject ChainBean046 dep3;
    public String process() { return "ChainBean207"; }
}
