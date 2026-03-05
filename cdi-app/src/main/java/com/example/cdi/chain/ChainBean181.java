package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean181 {

    @Inject ChainBean182 dep1;
    @Inject ChainBean189 dep2;
    @Inject ChainBean199 dep3;

    public String process() { return "ChainBean181"; }
}
