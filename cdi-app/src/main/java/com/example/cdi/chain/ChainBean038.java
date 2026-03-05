package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean038 {

    @Inject ChainBean039 dep1;
    @Inject ChainBean046 dep2;
    @Inject ChainBean056 dep3;

    public String process() { return "ChainBean038"; }
}
