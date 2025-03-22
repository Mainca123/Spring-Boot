package com.example.BaiTapVN2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gmail;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
