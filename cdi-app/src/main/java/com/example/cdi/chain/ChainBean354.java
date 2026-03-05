package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean354 {
    @Inject ChainBean156 dep1;
    @Inject ChainBean167 dep2;
    @Inject ChainBean193 dep3;
    public String process() { return "ChainBean354"; }
}
