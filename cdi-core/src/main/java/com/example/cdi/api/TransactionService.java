package com.example.cdi.api;

public interface TransactionService {
    String execute(String input);
    boolean isAvailable();
}
