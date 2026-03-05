package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean042 {

    @Inject ChainBean043 dep1;
    @Inject ChainBean050 dep2;
    @Inject ChainBean060 dep3;

    public String process() { return "ChainBean042"; }
}
