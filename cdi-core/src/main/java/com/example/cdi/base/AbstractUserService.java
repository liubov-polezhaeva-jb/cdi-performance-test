package com.example.cdi.base;

import com.example.cdi.api.UserService;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.qualifier.Q02;

@Q01
@Q02
public abstract class AbstractUserService implements UserService {
    protected String format(String result) {
        return getClass().getSimpleName() + ":" + result;
    }
}
