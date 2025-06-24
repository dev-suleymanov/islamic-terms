package com.example.islamicterms.repository;

import com.example.islamicterms.model.Source;

import java.util.Optional;

public interface SourceRepository {
    Optional<Source> findByName(String name);
    boolean existsByName(String name);
}
