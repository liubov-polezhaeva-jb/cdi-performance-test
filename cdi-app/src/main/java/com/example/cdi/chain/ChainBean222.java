package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean222 {
    @Inject ChainBean024 dep1;
    @Inject ChainBean035 dep2;
    @Inject ChainBean061 dep3;
    public String process() { return "ChainBean222"; }
}
