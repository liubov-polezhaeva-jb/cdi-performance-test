package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean088 {

    @Inject ChainBean089 dep1;
    @Inject ChainBean096 dep2;
    @Inject ChainBean106 dep3;

    public String process() { return "ChainBean088"; }
}
