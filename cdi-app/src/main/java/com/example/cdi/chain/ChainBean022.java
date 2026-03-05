package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean022 {

    @Inject ChainBean023 dep1;
    @Inject ChainBean030 dep2;
    @Inject ChainBean040 dep3;

    public String process() { return "ChainBean022"; }
}
