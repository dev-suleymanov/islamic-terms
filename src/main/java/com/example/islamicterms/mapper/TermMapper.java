package com.example.islamicterms.mapper;

import com.example.islamicterms.dto.TermDto;
import com.example.islamicterms.model.Term;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, SourceMapper.class})
public interface TermMapper {
    TermDto toDto(Term term);
}
