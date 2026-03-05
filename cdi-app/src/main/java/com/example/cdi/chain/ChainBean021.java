package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean021 {

    @Inject ChainBean022 dep1;
    @Inject ChainBean029 dep2;
    @Inject ChainBean039 dep3;

    public String process() { return "ChainBean021"; }
}
