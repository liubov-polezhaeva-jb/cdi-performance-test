package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean252 {
    @Inject ChainBean054 dep1;
    @Inject ChainBean065 dep2;
    @Inject ChainBean091 dep3;
    public String process() { return "ChainBean252"; }
}
