package com.example.cdi.producer;

import com.example.cdi.api.IntegrationService;
import com.example.cdi.api.ConfigService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/** HeavyProducerBean15: IntegrationService × 6 qualifiers + ConfigService × 6 qualifiers + 8 more producers = 20 @Produces */
@ApplicationScoped
public class HeavyProducerBean15 {

    @Produces @Q11 public IntegrationService produceIntegrationQ11() { return null; }
    @Produces @Q12 public IntegrationService produceIntegrationQ12() { return null; }
    @Produces @Blue public IntegrationService produceIntegrationBlue() { return null; }
    @Produces @Red public IntegrationService produceIntegrationRed() { return null; }
    @Produces @Primary public IntegrationService produceIntegrationPrimary() { return null; }
    @Produces @Secondary public IntegrationService produceIntegrationSecondary() { return null; }

    @Produces @Q11 public ConfigService produceConfigQ11() { return null; }
    @Produces @Q12 public ConfigService produceConfigQ12() { return null; }
    @Produces @Blue public ConfigService produceConfigBlue() { return null; }
    @Produces @Red public ConfigService produceConfigRed() { return null; }
    @Produces @Primary public ConfigService produceConfigPrimary() { return null; }
    @Produces @Secondary public ConfigService produceConfigSecondary() { return null; }
}
