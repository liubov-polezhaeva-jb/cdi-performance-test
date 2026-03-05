package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean073 {

    @Inject ChainBean074 dep1;
    @Inject ChainBean081 dep2;
    @Inject ChainBean091 dep3;

    public String process() { return "ChainBean073"; }
}
