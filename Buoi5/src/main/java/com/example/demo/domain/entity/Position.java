package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Positions")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, columnDefinition = "VARCHAR(100)")
    private String tile;

    @Column(columnDefinition = "TEXT")
    private String description;
}
