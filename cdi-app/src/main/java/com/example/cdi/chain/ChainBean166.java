package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean166 {

    @Inject ChainBean167 dep1;
    @Inject ChainBean174 dep2;
    @Inject ChainBean184 dep3;

    public String process() { return "ChainBean166"; }
}
