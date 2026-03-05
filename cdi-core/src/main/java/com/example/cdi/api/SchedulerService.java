package com.example.cdi.api;

public interface SchedulerService {
    String execute(String input);
    boolean isAvailable();
}
