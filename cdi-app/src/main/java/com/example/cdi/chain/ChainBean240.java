package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean240 {
    @Inject ChainBean042 dep1;
    @Inject ChainBean053 dep2;
    @Inject ChainBean079 dep3;
    public String process() { return "ChainBean240"; }
}
