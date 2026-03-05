package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean031 {

    @Inject ChainBean032 dep1;
    @Inject ChainBean039 dep2;
    @Inject ChainBean049 dep3;

    public String process() { return "ChainBean031"; }
}
