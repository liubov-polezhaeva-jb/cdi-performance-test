package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean168 {

    @Inject ChainBean169 dep1;
    @Inject ChainBean176 dep2;
    @Inject ChainBean186 dep3;

    public String process() { return "ChainBean168"; }
}
