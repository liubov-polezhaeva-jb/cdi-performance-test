package com.example.cdi.service.order;

import com.example.cdi.base.mid.MidAbstractOrderService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class OrderServiceImpl38 extends MidAbstractOrderService {
    @Override public String execute(String input) { return format("order-38:" + input); }
    @Override public boolean isAvailable() { return true; }
}
