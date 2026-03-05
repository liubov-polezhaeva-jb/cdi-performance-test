package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean255 {
    @Inject ChainBean057 dep1;
    @Inject ChainBean068 dep2;
    @Inject ChainBean094 dep3;
    public String process() { return "ChainBean255"; }
}
