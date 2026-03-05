package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean069 {

    @Inject ChainBean070 dep1;
    @Inject ChainBean077 dep2;
    @Inject ChainBean087 dep3;

    public String process() { return "ChainBean069"; }
}
