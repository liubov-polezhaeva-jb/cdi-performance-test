package com.example.cdi.service.security;

import com.example.cdi.base.mid.MidAbstractSecurityService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q09
@Red
public class SecurityServiceImpl06 extends MidAbstractSecurityService {

    @Override
    public String execute(String input) { return format("security-06:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
