package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean272 {
    @Inject ChainBean074 dep1;
    @Inject ChainBean085 dep2;
    @Inject ChainBean111 dep3;
    public String process() { return "ChainBean272"; }
}
