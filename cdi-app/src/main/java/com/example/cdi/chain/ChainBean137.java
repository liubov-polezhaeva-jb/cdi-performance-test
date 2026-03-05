package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean137 {

    @Inject ChainBean138 dep1;
    @Inject ChainBean145 dep2;
    @Inject ChainBean155 dep3;

    public String process() { return "ChainBean137"; }
}
