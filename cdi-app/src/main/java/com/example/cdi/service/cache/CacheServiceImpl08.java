package com.example.cdi.service.cache;

import com.example.cdi.base.mid.MidAbstractCacheService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class CacheServiceImpl08 extends MidAbstractCacheService {

    @Override
    public String execute(String input) { return format("cache-08:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
