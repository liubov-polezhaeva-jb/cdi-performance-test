package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean294 {
    @Inject ChainBean096 dep1;
    @Inject ChainBean107 dep2;
    @Inject ChainBean133 dep3;
    public String process() { return "ChainBean294"; }
}
