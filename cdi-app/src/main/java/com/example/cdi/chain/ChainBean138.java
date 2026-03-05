package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean138 {

    @Inject ChainBean139 dep1;
    @Inject ChainBean146 dep2;
    @Inject ChainBean156 dep3;

    public String process() { return "ChainBean138"; }
}
