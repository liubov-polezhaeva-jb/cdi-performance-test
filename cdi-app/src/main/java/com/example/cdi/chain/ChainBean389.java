package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean389 {
    @Inject ChainBean191 dep1;
    @Inject ChainBean003 dep2;
    @Inject ChainBean029 dep3;
    public String process() { return "ChainBean389"; }
}
