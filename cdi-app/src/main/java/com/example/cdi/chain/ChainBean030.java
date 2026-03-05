package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean030 {

    @Inject ChainBean031 dep1;
    @Inject ChainBean038 dep2;
    @Inject ChainBean048 dep3;

    public String process() { return "ChainBean030"; }
}
