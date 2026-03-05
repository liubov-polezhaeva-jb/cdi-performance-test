package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean037 {

    @Inject ChainBean038 dep1;
    @Inject ChainBean045 dep2;
    @Inject ChainBean055 dep3;

    public String process() { return "ChainBean037"; }
}
