package com.example.demo.service.impl;

import com.example.demo.constant.ErrorMessage;
import com.example.demo.domain.dto.request.CreateBookDTO;
import com.example.demo.domain.dto.request.UpdateBookDTO;
import com.example.demo.domain.dto.response.BookResponseDTO;
import com.example.demo.domain.entity.Book;
import com.example.demo.domain.mapper.BookMapper;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public Book findBookById(long id) {
        return bookRepository.findById(id).orElseThrow(()
        -> new NotFoundException(ErrorMessage.Book.ERR_NOT_FOUND_ID, new long[]{id}));
    }

    @Override
    public BookResponseDTO getBookById(long id) {
        return bookMapper.toBookResponseDTO(findBookById(id));
    }

    @Override
    public List<BookResponseDTO> getAllBook() {
        return bookMapper.toListBookResponseDTO(bookRepository.findAll());
    }

    @Override
    public BookResponseDTO updateBook(long id, UpdateBookDTO updateBookDTO) {
        Book book = findBookById(id);
        book = bookMapper.update(book, updateBookDTO);
        bookRepository.save(book);
        return bookMapper.toBookResponseDTO(book);
    }

    @Override
    public BookResponseDTO createBook(CreateBookDTO createBookDTO) {
        Book book = bookMapper.toBook(createBookDTO);
        bookRepository.save(book);
        return bookMapper.toBookResponseDTO(book);
    }

    @Override
    public BookResponseDTO deleteBookById(long id) {
        Book book = findBookById(id);
        bookRepository.deleteById(id);
        return bookMapper.toBookResponseDTO(book);
    }

    @Override
    public List<BookResponseDTO> findByAuthorId(long id) {
        return bookMapper.toListBookResponseDTO(bookRepository.findByAutherId(id));
    }

    @Override
    public List<BookResponseDTO> findByCategoryID(long id) {
        return bookMapper.toListBookResponseDTO(bookRepository.findByCategoryId(id));
    }
}
