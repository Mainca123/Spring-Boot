package com.example.BaiTapBuoi3.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name="user")
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "full_name", nullable = false, length = 100)
    private String name;
    @Column (unique = true, length = 150)
    private String email;
    @Column (name = "phone_number", length = 15)
    private String phone;
    @Column (name = "home_address", columnDefinition = "TEXT")
    private String address;

    public Student(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
