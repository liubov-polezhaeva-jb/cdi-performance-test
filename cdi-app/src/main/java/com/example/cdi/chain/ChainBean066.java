package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean066 {

    @Inject ChainBean067 dep1;
    @Inject ChainBean074 dep2;
    @Inject ChainBean084 dep3;

    public String process() { return "ChainBean066"; }
}
