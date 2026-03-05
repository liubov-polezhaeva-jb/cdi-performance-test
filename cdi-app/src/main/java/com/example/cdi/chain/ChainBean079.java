package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean079 {

    @Inject ChainBean080 dep1;
    @Inject ChainBean087 dep2;
    @Inject ChainBean097 dep3;

    public String process() { return "ChainBean079"; }
}
