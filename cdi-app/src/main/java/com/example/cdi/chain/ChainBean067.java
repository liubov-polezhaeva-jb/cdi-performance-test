package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean067 {

    @Inject ChainBean068 dep1;
    @Inject ChainBean075 dep2;
    @Inject ChainBean085 dep3;

    public String process() { return "ChainBean067"; }
}
