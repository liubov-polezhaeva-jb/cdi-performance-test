package com.example.cdi.service.search;

import com.example.cdi.base.mid.MidAbstractSearchService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q09
@Red
public class SearchServiceImpl48 extends MidAbstractSearchService {
    @Override public String execute(String input) { return format("search-48:" + input); }
    @Override public boolean isAvailable() { return true; }
}
