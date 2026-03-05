package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean226 {
    @Inject ChainBean028 dep1;
    @Inject ChainBean039 dep2;
    @Inject ChainBean065 dep3;
    public String process() { return "ChainBean226"; }
}
