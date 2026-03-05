package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean013 {

    @Inject ChainBean014 dep1;
    @Inject ChainBean021 dep2;
    @Inject ChainBean031 dep3;

    public String process() { return "ChainBean013"; }
}
