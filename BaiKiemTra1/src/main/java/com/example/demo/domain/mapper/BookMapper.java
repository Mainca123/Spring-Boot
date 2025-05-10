package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.CreateBookDTO;
import com.example.demo.domain.dto.request.UpdateAuthorDTO;
import com.example.demo.domain.dto.request.UpdateBookDTO;
import com.example.demo.domain.dto.response.BookResponseDTO;
import com.example.demo.domain.entity.Author;
import com.example.demo.domain.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toBook(CreateBookDTO createBookDTO);
    BookResponseDTO toBookResponseDTO(Book book);
    List<BookResponseDTO> toListBookResponseDTO(List<Book> books);
    Book update(@MappingTarget Book book, UpdateBookDTO updateBookDTO);

}
