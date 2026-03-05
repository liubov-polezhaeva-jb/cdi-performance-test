package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean014 {

    @Inject ChainBean015 dep1;
    @Inject ChainBean022 dep2;
    @Inject ChainBean032 dep3;

    public String process() { return "ChainBean014"; }
}
