package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean205 {
    @Inject ChainBean007 dep1;
    @Inject ChainBean018 dep2;
    @Inject ChainBean044 dep3;
    public String process() { return "ChainBean205"; }
}
