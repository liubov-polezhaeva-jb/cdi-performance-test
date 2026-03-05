package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean278 {
    @Inject ChainBean080 dep1;
    @Inject ChainBean091 dep2;
    @Inject ChainBean117 dep3;
    public String process() { return "ChainBean278"; }
}
