package com.example.cdi.service.report;

import com.example.cdi.base.mid.MidAbstractReportService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class ReportServiceImpl01 extends MidAbstractReportService {

    @Override
    public String execute(String input) { return format("report-01:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
