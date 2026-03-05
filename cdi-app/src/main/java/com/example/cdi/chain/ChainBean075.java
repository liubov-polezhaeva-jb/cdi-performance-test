package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean075 {

    @Inject ChainBean076 dep1;
    @Inject ChainBean083 dep2;
    @Inject ChainBean093 dep3;

    public String process() { return "ChainBean075"; }
}
