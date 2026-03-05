package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean003 {

    @Inject ChainBean004 dep1;
    @Inject ChainBean011 dep2;
    @Inject ChainBean021 dep3;

    public String process() { return "ChainBean003"; }
}
