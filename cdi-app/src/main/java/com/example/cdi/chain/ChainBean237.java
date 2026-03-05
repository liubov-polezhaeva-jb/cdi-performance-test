package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean237 {
    @Inject ChainBean039 dep1;
    @Inject ChainBean050 dep2;
    @Inject ChainBean076 dep3;
    public String process() { return "ChainBean237"; }
}
