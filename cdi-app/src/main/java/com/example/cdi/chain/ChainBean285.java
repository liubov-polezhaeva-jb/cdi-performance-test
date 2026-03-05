package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean285 {
    @Inject ChainBean087 dep1;
    @Inject ChainBean098 dep2;
    @Inject ChainBean124 dep3;
    public String process() { return "ChainBean285"; }
}
