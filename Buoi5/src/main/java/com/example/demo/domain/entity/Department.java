package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Departments")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Department {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
