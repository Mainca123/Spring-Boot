package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "author")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate dob;

    @Column
    private String bio;

}
