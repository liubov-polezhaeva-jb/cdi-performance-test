package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean026 {

    @Inject ChainBean027 dep1;
    @Inject ChainBean034 dep2;
    @Inject ChainBean044 dep3;

    public String process() { return "ChainBean026"; }
}
