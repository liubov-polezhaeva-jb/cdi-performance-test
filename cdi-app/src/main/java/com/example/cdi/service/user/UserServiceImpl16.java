package com.example.cdi.service.user;

import com.example.cdi.base.mid.MidAbstractUserService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class UserServiceImpl16 extends MidAbstractUserService {

    @Override
    public String execute(String input) { return format("user-16:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
