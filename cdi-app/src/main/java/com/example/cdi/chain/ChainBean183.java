package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean183 {

    @Inject ChainBean184 dep1;
    @Inject ChainBean191 dep2;
    @Inject ChainBean002 dep3;

    public String process() { return "ChainBean183"; }
}
