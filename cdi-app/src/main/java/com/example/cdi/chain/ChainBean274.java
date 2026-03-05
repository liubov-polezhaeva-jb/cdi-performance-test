package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean274 {
    @Inject ChainBean076 dep1;
    @Inject ChainBean087 dep2;
    @Inject ChainBean113 dep3;
    public String process() { return "ChainBean274"; }
}
