package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean218 {
    @Inject ChainBean020 dep1;
    @Inject ChainBean031 dep2;
    @Inject ChainBean057 dep3;
    public String process() { return "ChainBean218"; }
}
