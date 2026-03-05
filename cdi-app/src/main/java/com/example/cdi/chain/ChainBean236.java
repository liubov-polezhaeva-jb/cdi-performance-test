package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean236 {
    @Inject ChainBean038 dep1;
    @Inject ChainBean049 dep2;
    @Inject ChainBean075 dep3;
    public String process() { return "ChainBean236"; }
}
