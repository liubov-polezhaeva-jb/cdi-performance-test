package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean227 {
    @Inject ChainBean029 dep1;
    @Inject ChainBean040 dep2;
    @Inject ChainBean066 dep3;
    public String process() { return "ChainBean227"; }
}
