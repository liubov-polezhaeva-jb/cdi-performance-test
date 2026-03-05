package com.example.cdi.repository;

import com.example.cdi.model.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReportRepository extends BaseRepository<User> {
    @Override
    public User findById(Long id) {
        return store.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
    }
    public long count() { return store.size(); }
}
