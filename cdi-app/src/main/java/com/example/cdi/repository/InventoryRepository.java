package com.example.cdi.repository;

import com.example.cdi.model.Product;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventoryRepository extends BaseRepository<Product> {
    @Override
    public Product findById(Long id) {
        return store.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
    }
    public long count() { return store.size(); }
}
