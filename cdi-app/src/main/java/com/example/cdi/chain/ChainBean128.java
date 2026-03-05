package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean128 {

    @Inject ChainBean129 dep1;
    @Inject ChainBean136 dep2;
    @Inject ChainBean146 dep3;

    public String process() { return "ChainBean128"; }
}
