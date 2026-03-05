package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean239 {
    @Inject ChainBean041 dep1;
    @Inject ChainBean052 dep2;
    @Inject ChainBean078 dep3;
    public String process() { return "ChainBean239"; }
}
