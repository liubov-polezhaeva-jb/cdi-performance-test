package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean081 {

    @Inject ChainBean082 dep1;
    @Inject ChainBean089 dep2;
    @Inject ChainBean099 dep3;

    public String process() { return "ChainBean081"; }
}
