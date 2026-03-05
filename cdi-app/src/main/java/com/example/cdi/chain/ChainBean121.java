package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean121 {

    @Inject ChainBean122 dep1;
    @Inject ChainBean129 dep2;
    @Inject ChainBean139 dep3;

    public String process() { return "ChainBean121"; }
}
