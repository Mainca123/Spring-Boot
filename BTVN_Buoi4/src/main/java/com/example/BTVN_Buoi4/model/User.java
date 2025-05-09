package com.example.BTVN_Buoi4.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

@Entity
@Table (name = "users")
@Data
public class User {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (nullable = false)
    private String name;
    @Column (nullable = false)
    private Date dob;
    @Column (nullable = false)
    private Gender gender;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private String phone;

    @ManyToMany
    @JoinTable(
            name = "User_CLass",
            joinColumns = @JoinColumn(name = "User_id"),
            inverseJoinColumns = @JoinColumn(name = "Class_id")
    )
    private List<Classes> classes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
