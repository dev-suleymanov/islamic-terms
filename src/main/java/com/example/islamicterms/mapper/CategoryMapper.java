package com.example.islamicterms.mapper;

import com.example.islamicterms.dto.CategoryDto;
import com.example.islamicterms.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toDto(Category category);
}