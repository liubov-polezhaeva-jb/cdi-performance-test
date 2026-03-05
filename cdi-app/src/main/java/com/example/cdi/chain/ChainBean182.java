package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean182 {

    @Inject ChainBean183 dep1;
    @Inject ChainBean190 dep2;
    @Inject ChainBean001 dep3;

    public String process() { return "ChainBean182"; }
}
