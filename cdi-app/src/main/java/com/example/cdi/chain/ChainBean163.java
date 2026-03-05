package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean163 {

    @Inject ChainBean164 dep1;
    @Inject ChainBean171 dep2;
    @Inject ChainBean181 dep3;

    public String process() { return "ChainBean163"; }
}
