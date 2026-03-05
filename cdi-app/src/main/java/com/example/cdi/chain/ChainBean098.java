package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean098 {

    @Inject ChainBean099 dep1;
    @Inject ChainBean106 dep2;
    @Inject ChainBean116 dep3;

    public String process() { return "ChainBean098"; }
}
