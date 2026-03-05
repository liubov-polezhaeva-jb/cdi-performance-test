package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean018 {

    @Inject ChainBean019 dep1;
    @Inject ChainBean026 dep2;
    @Inject ChainBean036 dep3;

    public String process() { return "ChainBean018"; }
}
