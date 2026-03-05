package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean238 {
    @Inject ChainBean040 dep1;
    @Inject ChainBean051 dep2;
    @Inject ChainBean077 dep3;
    public String process() { return "ChainBean238"; }
}
