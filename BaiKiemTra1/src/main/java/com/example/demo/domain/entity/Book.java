package com.example.demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;
    @Column
    private String desciption;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "Author_Id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "Category_id")
    private Category category;

}
