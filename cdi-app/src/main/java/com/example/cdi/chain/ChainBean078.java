package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean078 {

    @Inject ChainBean079 dep1;
    @Inject ChainBean086 dep2;
    @Inject ChainBean096 dep3;

    public String process() { return "ChainBean078"; }
}
