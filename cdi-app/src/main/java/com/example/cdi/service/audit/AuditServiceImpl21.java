package com.example.cdi.service.audit;

import com.example.cdi.base.mid.MidAbstractAuditService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q08
@Blue
public class AuditServiceImpl21 extends MidAbstractAuditService {
    @Override public String execute(String input) { return format("audit-21:" + input); }
    @Override public boolean isAvailable() { return true; }
}
