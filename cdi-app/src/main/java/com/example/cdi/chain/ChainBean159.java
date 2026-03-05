package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean159 {

    @Inject ChainBean160 dep1;
    @Inject ChainBean167 dep2;
    @Inject ChainBean177 dep3;

    public String process() { return "ChainBean159"; }
}
