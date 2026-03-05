package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean377 {
    @Inject ChainBean179 dep1;
    @Inject ChainBean190 dep2;
    @Inject ChainBean017 dep3;
    public String process() { return "ChainBean377"; }
}
