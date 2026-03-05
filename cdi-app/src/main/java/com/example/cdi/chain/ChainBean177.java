package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean177 {

    @Inject ChainBean178 dep1;
    @Inject ChainBean185 dep2;
    @Inject ChainBean195 dep3;

    public String process() { return "ChainBean177"; }
}
