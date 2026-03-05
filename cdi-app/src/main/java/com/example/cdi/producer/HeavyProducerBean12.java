package com.example.cdi.producer;

import com.example.cdi.api.ImportService;
import com.example.cdi.api.ValidationService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/** HeavyProducerBean12: ImportService × 6 qualifiers + ValidationService × 6 qualifiers + 8 more producers = 20 @Produces */
@ApplicationScoped
public class HeavyProducerBean12 {

    @Produces @Q11 public ImportService produceImportQ11() { return null; }
    @Produces @Q12 public ImportService produceImportQ12() { return null; }
    @Produces @Blue public ImportService produceImportBlue() { return null; }
    @Produces @Red public ImportService produceImportRed() { return null; }
    @Produces @Primary public ImportService produceImportPrimary() { return null; }
    @Produces @Secondary public ImportService produceImportSecondary() { return null; }

    @Produces @Q11 public ValidationService produceValidationQ11() { return null; }
    @Produces @Q12 public ValidationService produceValidationQ12() { return null; }
    @Produces @Blue public ValidationService produceValidationBlue() { return null; }
    @Produces @Red public ValidationService produceValidationRed() { return null; }
    @Produces @Primary public ValidationService produceValidationPrimary() { return null; }
    @Produces @Secondary public ValidationService produceValidationSecondary() { return null; }
}
