package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean084 {

    @Inject ChainBean085 dep1;
    @Inject ChainBean092 dep2;
    @Inject ChainBean102 dep3;

    public String process() { return "ChainBean084"; }
}
