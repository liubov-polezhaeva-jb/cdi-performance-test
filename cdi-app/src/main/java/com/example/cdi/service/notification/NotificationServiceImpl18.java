package com.example.cdi.service.notification;

import com.example.cdi.base.mid.MidAbstractNotificationService;
import com.example.cdi.qualifier.*;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Q09
@Red
public class NotificationServiceImpl18 extends MidAbstractNotificationService {

    @Override
    public String execute(String input) { return format("notification-18:" + input); }

    @Override
    public boolean isAvailable() { return true; }
}
