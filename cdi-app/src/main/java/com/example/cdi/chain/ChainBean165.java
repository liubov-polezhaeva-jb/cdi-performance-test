package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean165 {

    @Inject ChainBean166 dep1;
    @Inject ChainBean173 dep2;
    @Inject ChainBean183 dep3;

    public String process() { return "ChainBean165"; }
}
