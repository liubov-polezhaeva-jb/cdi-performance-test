package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean027 {

    @Inject ChainBean028 dep1;
    @Inject ChainBean035 dep2;
    @Inject ChainBean045 dep3;

    public String process() { return "ChainBean027"; }
}
