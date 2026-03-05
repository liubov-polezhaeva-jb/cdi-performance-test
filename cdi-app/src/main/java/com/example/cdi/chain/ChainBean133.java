package com.example.cdi.chain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ChainBean133 {

    @Inject ChainBean134 dep1;
    @Inject ChainBean141 dep2;
    @Inject ChainBean151 dep3;

    public String process() { return "ChainBean133"; }
}
