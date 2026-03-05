package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean216 {
    @Inject ChainBean018 dep1;
    @Inject ChainBean029 dep2;
    @Inject ChainBean055 dep3;
    public String process() { return "ChainBean216"; }
}
