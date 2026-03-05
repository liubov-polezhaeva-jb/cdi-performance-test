package com.example.cdi.service.notification;

import com.example.cdi.base.mid.MidAbstractNotificationService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q08
@Blue
public class NotificationServiceImpl11 extends MidAbstractNotificationService {

    @Override
    public String execute(String input) { return format("notification-11:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
