package com.example.cdi.service.search;

import com.example.cdi.base.mid.MidAbstractSearchService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class SearchServiceImpl22 extends MidAbstractSearchService {
    @Override public String execute(String input) { return format("search-22:" + input); }
    @Override public boolean isAvailable() { return true; }
}
