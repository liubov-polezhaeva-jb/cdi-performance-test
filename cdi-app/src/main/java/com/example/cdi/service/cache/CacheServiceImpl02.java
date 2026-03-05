package com.example.cdi.service.cache;

import com.example.cdi.base.mid.MidAbstractCacheService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class CacheServiceImpl02 extends MidAbstractCacheService {

    @Override
    public String execute(String input) { return format("cache-02:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
