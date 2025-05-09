package com.example.demo.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PositionResponseDTO {
    private long id;
    private String tile;
    private String description;
}
