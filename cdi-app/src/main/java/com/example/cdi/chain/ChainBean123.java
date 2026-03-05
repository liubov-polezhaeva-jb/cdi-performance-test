package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean123 {

    @Inject ChainBean124 dep1;
    @Inject ChainBean131 dep2;
    @Inject ChainBean141 dep3;

    public String process() { return "ChainBean123"; }
}
