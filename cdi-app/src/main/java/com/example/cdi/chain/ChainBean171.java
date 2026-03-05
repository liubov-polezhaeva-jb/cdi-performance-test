package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean171 {

    @Inject ChainBean172 dep1;
    @Inject ChainBean179 dep2;
    @Inject ChainBean189 dep3;

    public String process() { return "ChainBean171"; }
}
