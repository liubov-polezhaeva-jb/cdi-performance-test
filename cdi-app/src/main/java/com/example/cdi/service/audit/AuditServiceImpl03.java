package com.example.cdi.service.audit;

import com.example.cdi.base.mid.MidAbstractAuditService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q08
@Blue
public class AuditServiceImpl03 extends MidAbstractAuditService {

    @Override
    public String execute(String input) { return format("audit-03:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
