package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean259 {
    @Inject ChainBean061 dep1;
    @Inject ChainBean072 dep2;
    @Inject ChainBean098 dep3;
    public String process() { return "ChainBean259"; }
}
