package com.example.demo.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table (name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(insertable = false, updatable = false, nullable = false)
    long id;

    @Column(unique = true, nullable = false)
    String username;

    @Column(nullable = false)
    @JsonIgnore
    String password;

    @Nationalized
    @Column(nullable = false)
    String firstName;

    @Nationalized
    @Column(nullable = false)
    String lastName;
}
