package com.example.cdi.producer;

import com.example.cdi.api.SchedulerService;
import com.example.cdi.api.MetricsService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/** HeavyProducerBean13: SchedulerService × 6 qualifiers + MetricsService × 6 qualifiers + 8 more producers = 20 @Produces */
@ApplicationScoped
public class HeavyProducerBean13 {

    @Produces @Q11 public SchedulerService produceSchedulerQ11() { return null; }
    @Produces @Q12 public SchedulerService produceSchedulerQ12() { return null; }
    @Produces @Blue public SchedulerService produceSchedulerBlue() { return null; }
    @Produces @Red public SchedulerService produceSchedulerRed() { return null; }
    @Produces @Primary public SchedulerService produceSchedulerPrimary() { return null; }
    @Produces @Secondary public SchedulerService produceSchedulerSecondary() { return null; }

    @Produces @Q11 public MetricsService produceMetricsQ11() { return null; }
    @Produces @Q12 public MetricsService produceMetricsQ12() { return null; }
    @Produces @Blue public MetricsService produceMetricsBlue() { return null; }
    @Produces @Red public MetricsService produceMetricsRed() { return null; }
    @Produces @Primary public MetricsService produceMetricsPrimary() { return null; }
    @Produces @Secondary public MetricsService produceMetricsSecondary() { return null; }
}
