package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean103 {

    @Inject ChainBean104 dep1;
    @Inject ChainBean111 dep2;
    @Inject ChainBean121 dep3;

    public String process() { return "ChainBean103"; }
}
