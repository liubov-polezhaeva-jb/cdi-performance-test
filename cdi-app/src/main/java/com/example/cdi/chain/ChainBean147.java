package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean147 {

    @Inject ChainBean148 dep1;
    @Inject ChainBean155 dep2;
    @Inject ChainBean165 dep3;

    public String process() { return "ChainBean147"; }
}
