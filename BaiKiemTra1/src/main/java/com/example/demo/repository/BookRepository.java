package com.example.demo.repository;

import com.example.demo.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.author.id = :id")
    List<Book> findByAutherId(long id);

    @Query("SELECT b FROM Book b WHERE b.category.id = :id")
    List<Book> findByCategoryId(long id);

}
