package com.example.cdi.producer;

import com.example.cdi.api.CacheService;
import com.example.cdi.api.ReportService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/**
 * HeavyProducerBean04: ReportService × Q01-Q10 + CacheService × Q01-Q10
 * 20 @Produces methods — stress resolveProducesBeans → isAssignable in CDI plugin (IDEA-359394 follow-up)
 */
@ApplicationScoped
public class HeavyProducerBean04 {

    @Produces @Q01 public ReportService produceReportQ01() { return null; }
    @Produces @Q02 public ReportService produceReportQ02() { return null; }
    @Produces @Q03 public ReportService produceReportQ03() { return null; }
    @Produces @Q04 public ReportService produceReportQ04() { return null; }
    @Produces @Q05 public ReportService produceReportQ05() { return null; }
    @Produces @Q06 public ReportService produceReportQ06() { return null; }
    @Produces @Q07 public ReportService produceReportQ07() { return null; }
    @Produces @Q08 public ReportService produceReportQ08() { return null; }
    @Produces @Q09 public ReportService produceReportQ09() { return null; }
    @Produces @Q10 public ReportService produceReportQ10() { return null; }

    @Produces @Q01 public CacheService produceCacheQ01() { return null; }
    @Produces @Q02 public CacheService produceCacheQ02() { return null; }
    @Produces @Q03 public CacheService produceCacheQ03() { return null; }
    @Produces @Q04 public CacheService produceCacheQ04() { return null; }
    @Produces @Q05 public CacheService produceCacheQ05() { return null; }
    @Produces @Q06 public CacheService produceCacheQ06() { return null; }
    @Produces @Q07 public CacheService produceCacheQ07() { return null; }
    @Produces @Q08 public CacheService produceCacheQ08() { return null; }
    @Produces @Q09 public CacheService produceCacheQ09() { return null; }
    @Produces @Q10 public CacheService produceCacheQ10() { return null; }
}
