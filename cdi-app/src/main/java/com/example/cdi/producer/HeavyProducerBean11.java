package com.example.cdi.producer;

import com.example.cdi.api.AnalyticsService;
import com.example.cdi.api.ExportService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/** HeavyProducerBean11: AnalyticsService × 6 qualifiers + ExportService × 6 qualifiers + 8 more producers = 20 @Produces */
@ApplicationScoped
public class HeavyProducerBean11 {

    @Produces @Q11 public AnalyticsService produceAnalyticsQ11() { return null; }
    @Produces @Q12 public AnalyticsService produceAnalyticsQ12() { return null; }
    @Produces @Blue public AnalyticsService produceAnalyticsBlue() { return null; }
    @Produces @Red public AnalyticsService produceAnalyticsRed() { return null; }
    @Produces @Primary public AnalyticsService produceAnalyticsPrimary() { return null; }
    @Produces @Secondary public AnalyticsService produceAnalyticsSecondary() { return null; }

    @Produces @Q11 public ExportService produceExportQ11() { return null; }
    @Produces @Q12 public ExportService produceExportQ12() { return null; }
    @Produces @Blue public ExportService produceExportBlue() { return null; }
    @Produces @Red public ExportService produceExportRed() { return null; }
    @Produces @Primary public ExportService produceExportPrimary() { return null; }
    @Produces @Secondary public ExportService produceExportSecondary() { return null; }
}
