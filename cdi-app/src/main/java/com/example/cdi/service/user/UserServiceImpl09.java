package com.example.cdi.service.user;

import com.example.cdi.base.mid.MidAbstractUserService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q08
@Blue
public class UserServiceImpl09 extends MidAbstractUserService {

    @Override
    public String execute(String input) { return format("user-09:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
