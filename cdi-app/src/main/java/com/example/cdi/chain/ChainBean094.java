package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean094 {

    @Inject ChainBean095 dep1;
    @Inject ChainBean102 dep2;
    @Inject ChainBean112 dep3;

    public String process() { return "ChainBean094"; }
}
