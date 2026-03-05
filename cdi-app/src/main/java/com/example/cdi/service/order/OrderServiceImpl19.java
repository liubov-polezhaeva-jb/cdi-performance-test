package com.example.cdi.service.order;

import com.example.cdi.base.mid.MidAbstractOrderService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class OrderServiceImpl19 extends MidAbstractOrderService {

    @Override
    public String execute(String input) { return format("order-19:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
