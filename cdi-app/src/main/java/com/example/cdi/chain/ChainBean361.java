package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean361 {
    @Inject ChainBean163 dep1;
    @Inject ChainBean174 dep2;
    @Inject ChainBean001 dep3;
    public String process() { return "ChainBean361"; }
}
