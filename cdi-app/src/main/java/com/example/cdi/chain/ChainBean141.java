package com.example.cdi.chain;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChainBean141 {

    @Inject ChainBean142 dep1;
    @Inject ChainBean149 dep2;
    @Inject ChainBean159 dep3;

    public String process() { return "ChainBean141"; }
}
