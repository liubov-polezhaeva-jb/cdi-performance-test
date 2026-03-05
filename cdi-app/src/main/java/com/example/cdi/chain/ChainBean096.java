package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean096 {

    @Inject ChainBean097 dep1;
    @Inject ChainBean104 dep2;
    @Inject ChainBean114 dep3;

    public String process() { return "ChainBean096"; }
}
