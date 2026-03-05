package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean140 {

    @Inject ChainBean141 dep1;
    @Inject ChainBean148 dep2;
    @Inject ChainBean158 dep3;

    public String process() { return "ChainBean140"; }
}
