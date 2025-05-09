package com.example.demo.domain.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateEmployeeDTO {

    @NotNull
    private String fullName;

    @NotBlank
    private Date DateOfBirth;

    @NotBlank
    private Date hiredDate;

    @NotBlank
    private double salary;

    @NotNull
    private long userId;

    @NotNull
    private long departmentId;

    @NotNull
    private long positionId;

}
