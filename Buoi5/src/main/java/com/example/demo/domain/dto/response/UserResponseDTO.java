package com.example.demo.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseDTO {

    private long id;
    private String userName;
    private String password;
    private String email;
    private LocalDate create_at;
}
