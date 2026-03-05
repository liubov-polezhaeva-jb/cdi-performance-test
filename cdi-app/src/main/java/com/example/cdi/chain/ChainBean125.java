package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean125 {

    @Inject ChainBean126 dep1;
    @Inject ChainBean133 dep2;
    @Inject ChainBean143 dep3;

    public String process() { return "ChainBean125"; }
}
