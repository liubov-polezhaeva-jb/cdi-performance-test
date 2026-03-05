package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean391 {
    @Inject ChainBean193 dep1;
    @Inject ChainBean005 dep2;
    @Inject ChainBean031 dep3;
    public String process() { return "ChainBean391"; }
}
