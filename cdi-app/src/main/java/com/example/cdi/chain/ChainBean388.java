package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean388 {
    @Inject ChainBean190 dep1;
    @Inject ChainBean002 dep2;
    @Inject ChainBean028 dep3;
    public String process() { return "ChainBean388"; }
}
