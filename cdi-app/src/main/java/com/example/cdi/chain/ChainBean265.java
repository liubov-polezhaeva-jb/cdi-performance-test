package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean265 {
    @Inject ChainBean067 dep1;
    @Inject ChainBean078 dep2;
    @Inject ChainBean104 dep3;
    public String process() { return "ChainBean265"; }
}
