package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean175 {

    @Inject ChainBean176 dep1;
    @Inject ChainBean183 dep2;
    @Inject ChainBean193 dep3;

    public String process() { return "ChainBean175"; }
}
