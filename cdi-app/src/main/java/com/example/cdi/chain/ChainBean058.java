package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean058 {

    @Inject ChainBean059 dep1;
    @Inject ChainBean066 dep2;
    @Inject ChainBean076 dep3;

    public String process() { return "ChainBean058"; }
}
