package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean039 {

    @Inject ChainBean040 dep1;
    @Inject ChainBean047 dep2;
    @Inject ChainBean057 dep3;

    public String process() { return "ChainBean039"; }
}
