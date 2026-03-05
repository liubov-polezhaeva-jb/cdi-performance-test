package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean289 {
    @Inject ChainBean091 dep1;
    @Inject ChainBean102 dep2;
    @Inject ChainBean128 dep3;
    public String process() { return "ChainBean289"; }
}
