package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean184 {

    @Inject ChainBean185 dep1;
    @Inject ChainBean192 dep2;
    @Inject ChainBean003 dep3;

    public String process() { return "ChainBean184"; }
}
