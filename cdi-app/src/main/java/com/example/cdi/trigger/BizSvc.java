package com.example.cdi.trigger;

import com.example.cdi.api.BusinessService;
import com.example.cdi.qualifier.Q05;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Short name = easy to type quickly before pressing dot.
 * Type "BizSvc." → Ctrl+Space to trigger CDI background scan.
 */
@ApplicationScoped
@Q05
public class BizSvc implements BusinessService {

    @Inject @Q05 BusinessService delegate;

    public static String version() { return "1.0"; }
    public static String name()    { return "BizSvc"; }
    public static BizSvc create()  { return new BizSvc(); }

    @Override public String execute(String input) { return "BizSvc:" + input; }
    @Override public boolean isAvailable()        { return true; }
}
