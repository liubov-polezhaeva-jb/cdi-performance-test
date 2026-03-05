package com.example.cdi.service.audit;

import com.example.cdi.base.mid.MidAbstractAuditService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class AuditServiceImpl17 extends MidAbstractAuditService {

    @Override
    public String execute(String input) { return format("audit-17:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
