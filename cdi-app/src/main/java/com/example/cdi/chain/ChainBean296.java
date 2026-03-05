package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean296 {
    @Inject ChainBean098 dep1;
    @Inject ChainBean109 dep2;
    @Inject ChainBean135 dep3;
    public String process() { return "ChainBean296"; }
}
