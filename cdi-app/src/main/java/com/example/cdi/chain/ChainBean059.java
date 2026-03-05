package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean059 {

    @Inject ChainBean060 dep1;
    @Inject ChainBean067 dep2;
    @Inject ChainBean077 dep3;

    public String process() { return "ChainBean059"; }
}
