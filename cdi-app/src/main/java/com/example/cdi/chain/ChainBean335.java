package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean335 {
    @Inject ChainBean137 dep1;
    @Inject ChainBean148 dep2;
    @Inject ChainBean174 dep3;
    public String process() { return "ChainBean335"; }
}
