package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean355 {
    @Inject ChainBean157 dep1;
    @Inject ChainBean168 dep2;
    @Inject ChainBean194 dep3;
    public String process() { return "ChainBean355"; }
}
