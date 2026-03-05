package com.example.cdi.producer;

import com.example.cdi.api.AlertService;
import com.example.cdi.api.WorkflowService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/** HeavyProducerBean14: AlertService × 6 qualifiers + WorkflowService × 6 qualifiers + 8 more producers = 20 @Produces */
@ApplicationScoped
public class HeavyProducerBean14 {

    @Produces @Q11 public AlertService produceAlertQ11() { return null; }
    @Produces @Q12 public AlertService produceAlertQ12() { return null; }
    @Produces @Blue public AlertService produceAlertBlue() { return null; }
    @Produces @Red public AlertService produceAlertRed() { return null; }
    @Produces @Primary public AlertService produceAlertPrimary() { return null; }
    @Produces @Secondary public AlertService produceAlertSecondary() { return null; }

    @Produces @Q11 public WorkflowService produceWorkflowQ11() { return null; }
    @Produces @Q12 public WorkflowService produceWorkflowQ12() { return null; }
    @Produces @Blue public WorkflowService produceWorkflowBlue() { return null; }
    @Produces @Red public WorkflowService produceWorkflowRed() { return null; }
    @Produces @Primary public WorkflowService produceWorkflowPrimary() { return null; }
    @Produces @Secondary public WorkflowService produceWorkflowSecondary() { return null; }
}
