package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean091 {

    @Inject ChainBean092 dep1;
    @Inject ChainBean099 dep2;
    @Inject ChainBean109 dep3;

    public String process() { return "ChainBean091"; }
}
