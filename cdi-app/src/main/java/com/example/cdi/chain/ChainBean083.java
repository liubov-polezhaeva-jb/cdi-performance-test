package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean083 {

    @Inject ChainBean084 dep1;
    @Inject ChainBean091 dep2;
    @Inject ChainBean101 dep3;

    public String process() { return "ChainBean083"; }
}
