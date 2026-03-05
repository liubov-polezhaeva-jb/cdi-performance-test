package com.example.cdi.producer;

import com.example.cdi.api.NotificationService;
import com.example.cdi.api.UserService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

/**
 * HeavyProducerBean03: UserService × Q04-Q12 + NotificationService × Q01-Q08 + Blue/Red
 * 20 @Produces methods — stress resolveProducesBeans → isAssignable in CDI plugin (IDEA-359394 follow-up)
 */
@ApplicationScoped
public class HeavyProducerBean03 {

    @Produces @Q04 public UserService produceUserQ04() { return null; }
    @Produces @Q05 public UserService produceUserQ05() { return null; }
    @Produces @Q06 public UserService produceUserQ06() { return null; }
    @Produces @Q07 public UserService produceUserQ07() { return null; }
    @Produces @Q08 public UserService produceUserQ08() { return null; }
    @Produces @Q09 public UserService produceUserQ09() { return null; }
    @Produces @Q10 public UserService produceUserQ10() { return null; }
    @Produces @Q11 public UserService produceUserQ11() { return null; }
    @Produces @Q12 public UserService produceUserQ12() { return null; }
    @Produces @Blue public UserService produceUserBlue() { return null; }
    @Produces @Red  public UserService produceUserRed()  { return null; }

    @Produces @Q01 public NotificationService produceNotifQ01() { return null; }
    @Produces @Q02 public NotificationService produceNotifQ02() { return null; }
    @Produces @Q03 public NotificationService produceNotifQ03() { return null; }
    @Produces @Q04 public NotificationService produceNotifQ04() { return null; }
    @Produces @Q05 public NotificationService produceNotifQ05() { return null; }
    @Produces @Q06 public NotificationService produceNotifQ06() { return null; }
    @Produces @Blue public NotificationService produceNotifBlue() { return null; }
    @Produces @Red  public NotificationService produceNotifRed()  { return null; }
    @Produces @Primary public NotificationService produceNotifPrimary() { return null; }
}
