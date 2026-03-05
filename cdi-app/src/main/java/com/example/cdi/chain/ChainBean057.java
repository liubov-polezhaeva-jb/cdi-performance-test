package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean057 {

    @Inject ChainBean058 dep1;
    @Inject ChainBean065 dep2;
    @Inject ChainBean075 dep3;

    public String process() { return "ChainBean057"; }
}
