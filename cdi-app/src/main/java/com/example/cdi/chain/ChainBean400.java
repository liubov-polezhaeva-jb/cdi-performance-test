package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean400 {
    @Inject ChainBean003 dep1;
    @Inject ChainBean014 dep2;
    @Inject ChainBean040 dep3;
    public String process() { return "ChainBean400"; }
}
