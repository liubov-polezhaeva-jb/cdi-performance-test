package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean061 {

    @Inject ChainBean062 dep1;
    @Inject ChainBean069 dep2;
    @Inject ChainBean079 dep3;

    public String process() { return "ChainBean061"; }
}
