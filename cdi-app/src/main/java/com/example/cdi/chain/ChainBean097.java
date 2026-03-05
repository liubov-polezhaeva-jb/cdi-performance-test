package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean097 {

    @Inject ChainBean098 dep1;
    @Inject ChainBean105 dep2;
    @Inject ChainBean115 dep3;

    public String process() { return "ChainBean097"; }
}
