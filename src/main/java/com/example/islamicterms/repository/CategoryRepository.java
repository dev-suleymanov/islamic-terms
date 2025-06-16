package com.example.islamicterms.repository;

import com.example.islamicterms.model.Category;

import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findByName(String name);
    boolean existsByName(String name);
    void testMethod();
    void testMethod3();
}
