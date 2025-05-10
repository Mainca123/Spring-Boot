package com.example.demo.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateAuthorDTO {
    @NotNull
    private String name;

    @NotNull
    private LocalDate dob;

    @NotBlank
    private String bio;
}
