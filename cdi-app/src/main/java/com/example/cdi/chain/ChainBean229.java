package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean229 {
    @Inject ChainBean031 dep1;
    @Inject ChainBean042 dep2;
    @Inject ChainBean068 dep3;
    public String process() { return "ChainBean229"; }
}
