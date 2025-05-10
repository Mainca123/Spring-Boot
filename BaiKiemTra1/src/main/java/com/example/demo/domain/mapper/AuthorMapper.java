package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.UpdateAuthorDTO;
import com.example.demo.domain.dto.response.AuthorResponseDTO;
import com.example.demo.domain.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toAuthor(AuthorResponseDTO authorResponseDTO);
    AuthorResponseDTO toAuthorResponseDTO(Author author);
    List<AuthorResponseDTO> toListAuthorResponseDTO(List<Author> authorList);
    Author update(@MappingTarget Author author, UpdateAuthorDTO updateAuthorDTO);
}
