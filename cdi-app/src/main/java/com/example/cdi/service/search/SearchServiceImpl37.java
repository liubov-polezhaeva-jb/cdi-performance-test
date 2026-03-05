package com.example.cdi.service.search;

import com.example.cdi.base.mid.MidAbstractSearchService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class SearchServiceImpl37 extends MidAbstractSearchService {
    @Override public String execute(String input) { return format("search-37:" + input); }
    @Override public boolean isAvailable() { return true; }
}
