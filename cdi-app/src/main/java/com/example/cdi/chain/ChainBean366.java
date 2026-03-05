package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean366 {
    @Inject ChainBean168 dep1;
    @Inject ChainBean179 dep2;
    @Inject ChainBean006 dep3;
    public String process() { return "ChainBean366"; }
}
