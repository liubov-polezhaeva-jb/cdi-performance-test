package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean292 {
    @Inject ChainBean094 dep1;
    @Inject ChainBean105 dep2;
    @Inject ChainBean131 dep3;
    public String process() { return "ChainBean292"; }
}
