package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean011 {

    @Inject ChainBean012 dep1;
    @Inject ChainBean019 dep2;
    @Inject ChainBean029 dep3;

    public String process() { return "ChainBean011"; }
}
