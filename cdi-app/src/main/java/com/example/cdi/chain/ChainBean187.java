package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean187 {

    @Inject ChainBean188 dep1;
    @Inject ChainBean195 dep2;
    @Inject ChainBean006 dep3;

    public String process() { return "ChainBean187"; }
}
