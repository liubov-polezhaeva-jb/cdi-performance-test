package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean180 {

    @Inject ChainBean181 dep1;
    @Inject ChainBean188 dep2;
    @Inject ChainBean198 dep3;

    public String process() { return "ChainBean180"; }
}
