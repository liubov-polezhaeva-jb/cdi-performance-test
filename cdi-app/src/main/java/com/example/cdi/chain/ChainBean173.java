package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean173 {

    @Inject ChainBean174 dep1;
    @Inject ChainBean181 dep2;
    @Inject ChainBean191 dep3;

    public String process() { return "ChainBean173"; }
}
