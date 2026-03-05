package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean060 {

    @Inject ChainBean061 dep1;
    @Inject ChainBean068 dep2;
    @Inject ChainBean078 dep3;

    public String process() { return "ChainBean060"; }
}
