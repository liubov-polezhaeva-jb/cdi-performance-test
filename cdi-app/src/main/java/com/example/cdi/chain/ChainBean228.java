package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean228 {
    @Inject ChainBean030 dep1;
    @Inject ChainBean041 dep2;
    @Inject ChainBean067 dep3;
    public String process() { return "ChainBean228"; }
}
