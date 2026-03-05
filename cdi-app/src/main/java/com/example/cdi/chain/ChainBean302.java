package com.example.cdi.chain;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ChainBean302 {
    @Inject ChainBean104 dep1;
    @Inject ChainBean115 dep2;
    @Inject ChainBean141 dep3;
    public String process() { return "ChainBean302"; }
}
