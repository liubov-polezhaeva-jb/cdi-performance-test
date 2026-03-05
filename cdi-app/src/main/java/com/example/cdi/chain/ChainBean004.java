package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean004 {

    @Inject ChainBean005 dep1;
    @Inject ChainBean012 dep2;
    @Inject ChainBean022 dep3;

    public String process() { return "ChainBean004"; }
}
