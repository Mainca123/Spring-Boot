package com.example.demo.domain.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateDepartmentDTO {

    @NotNull
    private String name;

    @NotBlank
    private String description;

}
