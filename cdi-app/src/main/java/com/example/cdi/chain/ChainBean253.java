package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean253 {
    @Inject ChainBean055 dep1;
    @Inject ChainBean066 dep2;
    @Inject ChainBean092 dep3;
    public String process() { return "ChainBean253"; }
}
