package com.example.cdi.repository;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public abstract class BaseRepository<T> {
    protected final List<T> store = new ArrayList<>();
    public void save(T entity) { store.add(entity); }
    public List<T> findAll() { return store; }
    public abstract T findById(Long id);
}
