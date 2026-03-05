package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean382 {
    @Inject ChainBean184 dep1;
    @Inject ChainBean195 dep2;
    @Inject ChainBean022 dep3;
    public String process() { return "ChainBean382"; }
}
