package com.example.demo.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthorResponseDTO {
    private long id;
    private String name;
    private LocalDate dob;
    private String bio;
}
