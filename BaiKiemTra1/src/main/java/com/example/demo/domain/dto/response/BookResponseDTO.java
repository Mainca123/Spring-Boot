package com.example.demo.domain.dto.response;

import com.example.demo.domain.entity.Author;
import com.example.demo.domain.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookResponseDTO {
    private long id;
    private String name;
    private String desciption;
    private double price;
    private Author author;
    private Category category;
}
