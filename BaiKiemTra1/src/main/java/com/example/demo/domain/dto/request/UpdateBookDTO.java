package com.example.demo.domain.dto.request;

import com.example.demo.domain.entity.Author;
import com.example.demo.domain.entity.Category;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateBookDTO {
    @NotNull
    private String name;
    @NotNull
    private String desciption;
    @NotNull
    private double price;
    @NotNull
    private Author author;
    @NotNull
    private Category category;
}
