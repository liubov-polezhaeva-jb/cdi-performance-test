package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean189 {

    @Inject ChainBean190 dep1;
    @Inject ChainBean197 dep2;
    @Inject ChainBean008 dep3;

    public String process() { return "ChainBean189"; }
}
