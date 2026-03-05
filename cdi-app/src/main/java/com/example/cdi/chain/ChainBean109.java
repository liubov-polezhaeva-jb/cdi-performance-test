package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean109 {

    @Inject ChainBean110 dep1;
    @Inject ChainBean117 dep2;
    @Inject ChainBean127 dep3;

    public String process() { return "ChainBean109"; }
}
