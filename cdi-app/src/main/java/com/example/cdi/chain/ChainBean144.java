package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean144 {

    @Inject ChainBean145 dep1;
    @Inject ChainBean152 dep2;
    @Inject ChainBean162 dep3;

    public String process() { return "ChainBean144"; }
}
