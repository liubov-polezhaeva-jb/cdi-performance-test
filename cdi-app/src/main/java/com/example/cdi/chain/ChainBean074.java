package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean074 {

    @Inject ChainBean075 dep1;
    @Inject ChainBean082 dep2;
    @Inject ChainBean092 dep3;

    public String process() { return "ChainBean074"; }
}
