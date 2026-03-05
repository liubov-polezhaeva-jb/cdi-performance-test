package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean071 {

    @Inject ChainBean072 dep1;
    @Inject ChainBean079 dep2;
    @Inject ChainBean089 dep3;

    public String process() { return "ChainBean071"; }
}
