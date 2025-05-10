package com.example.demo.service.impl;

import com.example.demo.constant.ErrorMessage;
import com.example.demo.domain.dto.request.UpdateAuthorDTO;
import com.example.demo.domain.dto.response.AuthorResponseDTO;
import com.example.demo.domain.entity.Author;
import com.example.demo.domain.mapper.AuthorMapper;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public Author findAuthorById(long id) {
        return authorRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Author.ERR_NOT_FOUND_ID, new long[]{id}));
    }

    @Override
    public List<AuthorResponseDTO> getAllAuther() {
        return authorMapper.toListAuthorResponseDTO(authorRepository.findAll());
    }

    @Override
    public AuthorResponseDTO updateAuthor(long id, UpdateAuthorDTO updateAuthorDTO) {
        Author author = findAuthorById(id);
        author = authorMapper.update(author, updateAuthorDTO);
        authorRepository.save(author);
        return authorMapper.toAuthorResponseDTO(author);
    }

    @Override
    public AuthorResponseDTO deleteAuthorById(long id) {
        return null;
    }
}
