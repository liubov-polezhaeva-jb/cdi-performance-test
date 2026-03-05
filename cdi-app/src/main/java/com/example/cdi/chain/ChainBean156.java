package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean156 {

    @Inject ChainBean157 dep1;
    @Inject ChainBean164 dep2;
    @Inject ChainBean174 dep3;

    public String process() { return "ChainBean156"; }
}
