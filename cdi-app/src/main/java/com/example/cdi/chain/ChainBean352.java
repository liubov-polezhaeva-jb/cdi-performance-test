package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean352 {
    @Inject ChainBean154 dep1;
    @Inject ChainBean165 dep2;
    @Inject ChainBean191 dep3;
    public String process() { return "ChainBean352"; }
}
