package com.example.islamicterms.mapper;

import com.example.islamicterms.dto.SourceDto;
import com.example.islamicterms.model.Source;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SourceMapper {
    SourceDto toDto(Source source);
}
