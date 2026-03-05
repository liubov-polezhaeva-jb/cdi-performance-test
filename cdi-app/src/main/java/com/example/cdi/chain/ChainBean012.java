package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean012 {

    @Inject ChainBean013 dep1;
    @Inject ChainBean020 dep2;
    @Inject ChainBean030 dep3;

    public String process() { return "ChainBean012"; }
}
