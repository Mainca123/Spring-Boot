package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.response.EmployeeResponseDTO;
import com.example.demo.domain.entity.CreateEmployeeDTO;
import com.example.demo.domain.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEmployees(CreateEmployeeDTO createEmployeeDTO);
    EmployeeResponseDTO toEmployeeResponseDTO(Employee employee);
    List<EmployeeResponseDTO> toEmployeeResponseDTOList(List<Employee> employees);
}
