package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean258 {
    @Inject ChainBean060 dep1;
    @Inject ChainBean071 dep2;
    @Inject ChainBean097 dep3;
    public String process() { return "ChainBean258"; }
}
