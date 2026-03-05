package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean283 {
    @Inject ChainBean085 dep1;
    @Inject ChainBean096 dep2;
    @Inject ChainBean122 dep3;
    public String process() { return "ChainBean283"; }
}
