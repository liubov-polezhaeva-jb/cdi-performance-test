package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean305 {
    @Inject ChainBean107 dep1;
    @Inject ChainBean118 dep2;
    @Inject ChainBean144 dep3;
    public String process() { return "ChainBean305"; }
}
