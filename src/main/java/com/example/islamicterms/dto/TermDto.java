package com.example.islamicterms.dto;

public record TermDto(
        Long id,
        String name,
        String definition,
        CategoryDto category,
        SourceDto source)
{}
