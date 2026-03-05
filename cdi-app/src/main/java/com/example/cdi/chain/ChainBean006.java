package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean006 {

    @Inject ChainBean007 dep1;
    @Inject ChainBean014 dep2;
    @Inject ChainBean024 dep3;

    public String process() { return "ChainBean006"; }
}
