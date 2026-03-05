package com.example.cdi.producer;

import com.example.cdi.api.AuditService;
import com.example.cdi.api.SearchService;
import com.example.cdi.api.SecurityService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/**
 * HeavyProducerBean05: SecurityService × Q01-Q08 + Blue/Red + AuditService × Q01-Q08 + SearchService × Q01-Q02
 * 20 @Produces methods — stress resolveProducesBeans → isAssignable in CDI plugin (IDEA-359394 follow-up)
 */
@ApplicationScoped
public class HeavyProducerBean05 {

    @Produces @Q01 public SecurityService produceSecurityQ01() { return null; }
    @Produces @Q02 public SecurityService produceSecurityQ02() { return null; }
    @Produces @Q03 public SecurityService produceSecurityQ03() { return null; }
    @Produces @Q04 public SecurityService produceSecurityQ04() { return null; }
    @Produces @Q05 public SecurityService produceSecurityQ05() { return null; }
    @Produces @Q06 public SecurityService produceSecurityQ06() { return null; }
    @Produces @Q07 public SecurityService produceSecurityQ07() { return null; }
    @Produces @Q08 public SecurityService produceSecurityQ08() { return null; }
    @Produces @Blue public SecurityService produceSecurityBlue() { return null; }
    @Produces @Red  public SecurityService produceSecurityRed()  { return null; }

    @Produces @Q01 public AuditService produceAuditQ01() { return null; }
    @Produces @Q02 public AuditService produceAuditQ02() { return null; }
    @Produces @Q03 public AuditService produceAuditQ03() { return null; }
    @Produces @Q04 public AuditService produceAuditQ04() { return null; }
    @Produces @Q05 public AuditService produceAuditQ05() { return null; }
    @Produces @Q06 public AuditService produceAuditQ06() { return null; }
    @Produces @Q07 public AuditService produceAuditQ07() { return null; }
    @Produces @Q08 public AuditService produceAuditQ08() { return null; }

    @Produces @Q01 public SearchService produceSearchQ01() { return null; }
    @Produces @Q02 public SearchService produceSearchQ02() { return null; }
}
