package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean219 {
    @Inject ChainBean021 dep1;
    @Inject ChainBean032 dep2;
    @Inject ChainBean058 dep3;
    public String process() { return "ChainBean219"; }
}
