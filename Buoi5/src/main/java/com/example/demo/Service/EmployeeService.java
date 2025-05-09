package com.example.demo.service;

import com.example.demo.domain.dto.response.EmployeeResponseDTO;
import com.example.demo.domain.entity.CreateEmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponseDTO> getAllEmployees();
    EmployeeResponseDTO getEmployeeById(long id);
    EmployeeResponseDTO createEmployee(CreateEmployeeDTO createEmployeeDTO);
    EmployeeResponseDTO deleteEmployeeByID(long id);
    List<EmployeeResponseDTO> findEmployeeByFullName(String name);
    EmployeeResponseDTO findEmployeeByDepartmentId(long id);
    EmployeeResponseDTO findEmployeeByPositionId(long id);
    List<EmployeeResponseDTO> findEmployeeByFullName_Salary(String name, double salary);
}
