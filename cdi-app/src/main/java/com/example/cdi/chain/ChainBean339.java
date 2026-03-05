package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean339 {
    @Inject ChainBean141 dep1;
    @Inject ChainBean152 dep2;
    @Inject ChainBean178 dep3;
    public String process() { return "ChainBean339"; }
}
