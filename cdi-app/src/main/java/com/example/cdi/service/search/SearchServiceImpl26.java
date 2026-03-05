package com.example.cdi.service.search;

import com.example.cdi.base.mid.MidAbstractSearchService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class SearchServiceImpl26 extends MidAbstractSearchService {
    @Override public String execute(String input) { return format("search-26:" + input); }
    @Override public boolean isAvailable() { return true; }
}
