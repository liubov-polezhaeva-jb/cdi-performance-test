package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean263 {
    @Inject ChainBean065 dep1;
    @Inject ChainBean076 dep2;
    @Inject ChainBean102 dep3;
    public String process() { return "ChainBean263"; }
}
