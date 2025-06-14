package com.example.islamicterms.dto;

public record TermDto(
        Long id,
        String name,
        String definition,
        String category,
        String source)
{}
