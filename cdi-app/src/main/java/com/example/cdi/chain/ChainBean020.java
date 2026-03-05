package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean020 {

    @Inject ChainBean021 dep1;
    @Inject ChainBean028 dep2;
    @Inject ChainBean038 dep3;

    public String process() { return "ChainBean020"; }
}
