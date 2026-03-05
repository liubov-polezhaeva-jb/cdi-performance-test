package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean295 {
    @Inject ChainBean097 dep1;
    @Inject ChainBean108 dep2;
    @Inject ChainBean134 dep3;
    public String process() { return "ChainBean295"; }
}
