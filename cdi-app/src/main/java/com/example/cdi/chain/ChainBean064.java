package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean064 {

    @Inject ChainBean065 dep1;
    @Inject ChainBean072 dep2;
    @Inject ChainBean082 dep3;

    public String process() { return "ChainBean064"; }
}
