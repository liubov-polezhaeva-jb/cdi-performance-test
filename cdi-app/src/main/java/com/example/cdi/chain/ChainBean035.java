package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean035 {

    @Inject ChainBean036 dep1;
    @Inject ChainBean043 dep2;
    @Inject ChainBean053 dep3;

    public String process() { return "ChainBean035"; }
}
