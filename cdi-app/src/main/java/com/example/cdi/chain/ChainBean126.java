package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean126 {

    @Inject ChainBean127 dep1;
    @Inject ChainBean134 dep2;
    @Inject ChainBean144 dep3;

    public String process() { return "ChainBean126"; }
}
