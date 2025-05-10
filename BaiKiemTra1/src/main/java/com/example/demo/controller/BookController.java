package com.example.demo.controller;

import com.example.demo.base.VsResponseUtil;
import com.example.demo.constant.UrlConstant;
import com.example.demo.domain.dto.request.CreateBookDTO;
import com.example.demo.domain.dto.request.UpdateBookDTO;
import com.example.demo.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping(UrlConstant.Book.CREATE_BOOK)
    private ResponseEntity<?> createBook(@Valid @RequestBody CreateBookDTO createBookDTO){
        return VsResponseUtil.success(bookService.createBook(createBookDTO));
    }

    @GetMapping(UrlConstant.Book.GET_ALL_BOOK)
    private ResponseEntity<?> getAllBook(){
        return VsResponseUtil.success(bookService.getAllBook());
    }

    @GetMapping(UrlConstant.Book.GET_BOOK_BY_ID)
    private ResponseEntity<?> getBookByID(@PathVariable("id") long id){
        return VsResponseUtil.success(bookService.getBookById(id));
    }

    @PutMapping(UrlConstant.Book.UPDATE_BOOK)
    private ResponseEntity<?> updateBook(@PathVariable("id") long id,@Valid @RequestBody UpdateBookDTO updateBookDTO){
        return VsResponseUtil.success(bookService.updateBook(id, updateBookDTO));
    }

    @DeleteMapping(UrlConstant.Book.DELETE_BOOK_BY_ID)
    private ResponseEntity<?> deleteBoobById(@PathVariable("id") long id){
        return VsResponseUtil.success(bookService.deleteBookById(id));
    }

    @GetMapping(UrlConstant.Book.GET_BOOK_BY_AUTHER_ID)
    private ResponseEntity<?> getBookByAuthorId(@PathVariable("id") long id){
        return VsResponseUtil.success(bookService.findByAuthorId(id));
    }

    @GetMapping(UrlConstant.Book.GET_BOOK_BY_CATEGORY_ID)
    private ResponseEntity<?> getBookByCategoryId(@PathVariable("id") long id){
        return VsResponseUtil.success(bookService.findByCategoryID(id));
    }
}
