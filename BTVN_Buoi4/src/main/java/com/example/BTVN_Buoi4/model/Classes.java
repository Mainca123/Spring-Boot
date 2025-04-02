package com.example.BTVN_Buoi4.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "classes")
@Data
public class Classes {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false)
    private int id;
    @Column (nullable = false)
    private String name;
    @Column (nullable = false)
    private String subject;


}

