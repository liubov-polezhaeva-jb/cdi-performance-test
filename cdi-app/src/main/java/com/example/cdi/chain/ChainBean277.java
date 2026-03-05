package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean277 {
    @Inject ChainBean079 dep1;
    @Inject ChainBean090 dep2;
    @Inject ChainBean116 dep3;
    public String process() { return "ChainBean277"; }
}
