package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean190 {

    @Inject ChainBean191 dep1;
    @Inject ChainBean198 dep2;
    @Inject ChainBean009 dep3;

    public String process() { return "ChainBean190"; }
}
