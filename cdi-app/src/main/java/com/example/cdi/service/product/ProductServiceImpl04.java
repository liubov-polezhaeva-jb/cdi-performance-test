package com.example.cdi.service.product;

import com.example.cdi.base.mid.MidAbstractProductService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class ProductServiceImpl04 extends MidAbstractProductService {

    @Override
    public String execute(String input) { return format("product-04:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
