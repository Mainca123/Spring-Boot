package com.example.demo.service;

import com.example.demo.domain.dto.request.UpdateAuthorDTO;
import com.example.demo.domain.dto.response.AuthorResponseDTO;
import com.example.demo.domain.entity.Author;

import java.util.List;

public interface AuthorService {
    Author findAuthorById(long id);
    List<AuthorResponseDTO> getAllAuther();
    AuthorResponseDTO updateAuthor(long id, UpdateAuthorDTO updateAuthorDTO);
    AuthorResponseDTO deleteAuthorById(long id);

}
