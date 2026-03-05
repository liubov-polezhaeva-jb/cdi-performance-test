package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean300 {
    @Inject ChainBean102 dep1;
    @Inject ChainBean113 dep2;
    @Inject ChainBean139 dep3;
    public String process() { return "ChainBean300"; }
}
