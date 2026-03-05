package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean199 {

    @Inject ChainBean001 dep1;
    @Inject ChainBean008 dep2;
    @Inject ChainBean018 dep3;

    public String process() { return "ChainBean199"; }
}
