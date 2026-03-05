package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean264 {
    @Inject ChainBean066 dep1;
    @Inject ChainBean077 dep2;
    @Inject ChainBean103 dep3;
    public String process() { return "ChainBean264"; }
}
