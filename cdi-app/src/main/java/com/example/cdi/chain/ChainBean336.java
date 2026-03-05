package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean336 {
    @Inject ChainBean138 dep1;
    @Inject ChainBean149 dep2;
    @Inject ChainBean175 dep3;
    public String process() { return "ChainBean336"; }
}
