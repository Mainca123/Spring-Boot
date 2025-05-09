package com.example.demo.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table (name = "Users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false, columnDefinition = "VARCHAR(50)")
    private String userName;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    @JsonIgnore
    private String password;

    @Column(nullable = false, unique = true, columnDefinition = "VARCHAR(100)")
    private String email;

    @Column(updatable = false)
    private LocalDate create_at;

}
