package com.example.cdi.base;

import com.example.cdi.api.SearchService;
import com.example.cdi.qualifier.Q01;
import com.example.cdi.qualifier.Q02;

@Q01
@Q02
public abstract class AbstractSearchService implements SearchService {
    protected String format(String result) {
        return getClass().getSimpleName() + ":" + result;
    }
}
