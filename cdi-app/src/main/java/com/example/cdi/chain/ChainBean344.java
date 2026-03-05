package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean344 {
    @Inject ChainBean146 dep1;
    @Inject ChainBean157 dep2;
    @Inject ChainBean183 dep3;
    public String process() { return "ChainBean344"; }
}
