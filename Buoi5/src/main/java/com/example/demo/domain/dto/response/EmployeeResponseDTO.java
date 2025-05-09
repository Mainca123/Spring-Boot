package com.example.demo.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeResponseDTO {

    private long id;
    private String fullName;
    private Date DateOfBirth;
    private Date hiredDate;
    private double salary;
    private long userId;
    private long departmentId;
    private long positionId;

}
