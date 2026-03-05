package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean397 {
    @Inject ChainBean199 dep1;
    @Inject ChainBean011 dep2;
    @Inject ChainBean037 dep3;
    public String process() { return "ChainBean397"; }
}
