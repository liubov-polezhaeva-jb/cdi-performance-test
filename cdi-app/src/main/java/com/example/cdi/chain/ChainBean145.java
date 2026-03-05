package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean145 {

    @Inject ChainBean146 dep1;
    @Inject ChainBean153 dep2;
    @Inject ChainBean163 dep3;

    public String process() { return "ChainBean145"; }
}
