package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean225 {
    @Inject ChainBean027 dep1;
    @Inject ChainBean038 dep2;
    @Inject ChainBean064 dep3;
    public String process() { return "ChainBean225"; }
}
