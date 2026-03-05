package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean093 {

    @Inject ChainBean094 dep1;
    @Inject ChainBean101 dep2;
    @Inject ChainBean111 dep3;

    public String process() { return "ChainBean093"; }
}
