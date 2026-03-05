package com.example.cdi.service.security;

import com.example.cdi.base.mid.MidAbstractSecurityService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class SecurityServiceImpl19 extends MidAbstractSecurityService {

    @Override
    public String execute(String input) { return format("security-19:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
