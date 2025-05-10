package com.example.demo.service;

import com.example.demo.domain.dto.request.CreateBookDTO;
import com.example.demo.domain.dto.request.UpdateBookDTO;
import com.example.demo.domain.dto.response.BookResponseDTO;
import com.example.demo.domain.entity.Book;

import java.util.List;

public interface BookService {
    Book findBookById(long id);
    BookResponseDTO getBookById(long id);
    List<BookResponseDTO> getAllBook();
    BookResponseDTO updateBook(long id, UpdateBookDTO updateBookDTO);
    BookResponseDTO createBook(CreateBookDTO createBookDTO);
    BookResponseDTO deleteBookById(long id);
    List<BookResponseDTO> findByAuthorId(long id);
    List<BookResponseDTO> findByCategoryID(long id);
}
