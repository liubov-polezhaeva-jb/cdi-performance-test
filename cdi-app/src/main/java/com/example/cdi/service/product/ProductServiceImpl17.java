package com.example.cdi.service.product;

import com.example.cdi.base.mid.MidAbstractProductService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class ProductServiceImpl17 extends MidAbstractProductService {

    @Override
    public String execute(String input) { return format("product-17:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
