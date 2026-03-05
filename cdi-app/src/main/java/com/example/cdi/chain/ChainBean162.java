package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean162 {

    @Inject ChainBean163 dep1;
    @Inject ChainBean170 dep2;
    @Inject ChainBean180 dep3;

    public String process() { return "ChainBean162"; }
}
