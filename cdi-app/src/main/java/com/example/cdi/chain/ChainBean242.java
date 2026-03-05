package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean242 {
    @Inject ChainBean044 dep1;
    @Inject ChainBean055 dep2;
    @Inject ChainBean081 dep3;
    public String process() { return "ChainBean242"; }
}
