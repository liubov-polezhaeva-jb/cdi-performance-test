package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean195 {

    @Inject ChainBean196 dep1;
    @Inject ChainBean004 dep2;
    @Inject ChainBean014 dep3;

    public String process() { return "ChainBean195"; }
}
