package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean174 {

    @Inject ChainBean175 dep1;
    @Inject ChainBean182 dep2;
    @Inject ChainBean192 dep3;

    public String process() { return "ChainBean174"; }
}
