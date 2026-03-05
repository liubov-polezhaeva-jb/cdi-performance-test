package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean167 {

    @Inject ChainBean168 dep1;
    @Inject ChainBean175 dep2;
    @Inject ChainBean185 dep3;

    public String process() { return "ChainBean167"; }
}
