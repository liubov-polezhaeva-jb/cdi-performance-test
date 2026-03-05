package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean047 {

    @Inject ChainBean048 dep1;
    @Inject ChainBean055 dep2;
    @Inject ChainBean065 dep3;

    public String process() { return "ChainBean047"; }
}
