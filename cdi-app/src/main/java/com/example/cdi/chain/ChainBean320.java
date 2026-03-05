package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean320 {
    @Inject ChainBean122 dep1;
    @Inject ChainBean133 dep2;
    @Inject ChainBean159 dep3;
    public String process() { return "ChainBean320"; }
}
