package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean217 {
    @Inject ChainBean019 dep1;
    @Inject ChainBean030 dep2;
    @Inject ChainBean056 dep3;
    public String process() { return "ChainBean217"; }
}
