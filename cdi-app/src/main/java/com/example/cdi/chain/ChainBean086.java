package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean086 {

    @Inject ChainBean087 dep1;
    @Inject ChainBean094 dep2;
    @Inject ChainBean104 dep3;

    public String process() { return "ChainBean086"; }
}
