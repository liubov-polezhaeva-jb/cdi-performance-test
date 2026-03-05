package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean108 {

    @Inject ChainBean109 dep1;
    @Inject ChainBean116 dep2;
    @Inject ChainBean126 dep3;

    public String process() { return "ChainBean108"; }
}
