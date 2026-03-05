package com.example.cdi.service.user;

import com.example.cdi.base.mid.MidAbstractUserService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q09
@Red
public class UserServiceImpl12 extends MidAbstractUserService {

    @Override
    public String execute(String input) { return format("user-12:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
