package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean090 {

    @Inject ChainBean091 dep1;
    @Inject ChainBean098 dep2;
    @Inject ChainBean108 dep3;

    public String process() { return "ChainBean090"; }
}
