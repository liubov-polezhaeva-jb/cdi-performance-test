package com.example.cdi.trigger;

import com.example.cdi.api.UserService;
import com.example.cdi.base.mid.MidAbstractUserService;
import com.example.cdi.qualifier.Q08;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Type "UsrSvc." → Ctrl+Space — triggers CDI scan over 50 UserService candidates.
 */
@ApplicationScoped
@Q08
public class UsrSvc extends MidAbstractUserService {

    @Inject @Q08 UserService delegate;

    public static String version() { return "1.0"; }
    public static String realm()   { return "default"; }
    public static UsrSvc create()  { return new UsrSvc(); }

    @Override public String execute(String input) { return format("UsrSvc:" + input); }
    @Override public boolean isAvailable()        { return true; }
}
