package com.example.islamicterms.repository;

import com.example.islamicterms.model.Term;

import java.util.List;
import java.util.Optional;

public interface TermRepository {
    Optional<Term> findByName(String name);
    boolean existsByName(String name);
    // TODO: the method will be modified later
    List<Term> searchSimilar(String name);
}
