package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean157 {

    @Inject ChainBean158 dep1;
    @Inject ChainBean165 dep2;
    @Inject ChainBean175 dep3;

    public String process() { return "ChainBean157"; }
}
