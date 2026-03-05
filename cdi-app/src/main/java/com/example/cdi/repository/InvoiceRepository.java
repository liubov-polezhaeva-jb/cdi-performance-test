package com.example.cdi.repository;

import com.example.cdi.model.Order;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InvoiceRepository extends BaseRepository<Order> {
    @Override
    public Order findById(Long id) {
        return store.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
    }
    public long count() { return store.size(); }
}
