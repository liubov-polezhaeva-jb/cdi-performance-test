package com.example.cdi.service.notification;

import com.example.cdi.base.mid.MidAbstractNotificationService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Q09
@Red
public class NotificationServiceImpl08 extends MidAbstractNotificationService {

    @Override
    public String execute(String input) { return format("notification-08:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
