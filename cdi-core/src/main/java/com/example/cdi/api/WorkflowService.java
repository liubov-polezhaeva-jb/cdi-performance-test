package com.example.cdi.api;

public interface WorkflowService {
    String execute(String input);
    boolean isAvailable();
}
