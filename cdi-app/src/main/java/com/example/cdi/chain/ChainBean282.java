package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean282 {
    @Inject ChainBean084 dep1;
    @Inject ChainBean095 dep2;
    @Inject ChainBean121 dep3;
    public String process() { return "ChainBean282"; }
}
