package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean248 {
    @Inject ChainBean050 dep1;
    @Inject ChainBean061 dep2;
    @Inject ChainBean087 dep3;
    public String process() { return "ChainBean248"; }
}
