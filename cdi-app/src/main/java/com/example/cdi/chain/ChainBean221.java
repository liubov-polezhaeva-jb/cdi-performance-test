package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean221 {
    @Inject ChainBean023 dep1;
    @Inject ChainBean034 dep2;
    @Inject ChainBean060 dep3;
    public String process() { return "ChainBean221"; }
}
