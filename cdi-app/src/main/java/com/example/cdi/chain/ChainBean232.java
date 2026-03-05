package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean232 {
    @Inject ChainBean034 dep1;
    @Inject ChainBean045 dep2;
    @Inject ChainBean071 dep3;
    public String process() { return "ChainBean232"; }
}
