package com.example.cdi.repository;

import com.example.cdi.model.Payment;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaymentRepository extends BaseRepository<Payment> {
    @Override
    public Payment findById(Long id) {
        return store.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
    }
    public long count() { return store.size(); }
}
