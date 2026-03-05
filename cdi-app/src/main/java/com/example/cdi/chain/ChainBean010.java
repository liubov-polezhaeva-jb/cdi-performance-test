package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean010 {

    @Inject ChainBean011 dep1;
    @Inject ChainBean018 dep2;
    @Inject ChainBean028 dep3;

    public String process() { return "ChainBean010"; }
}
